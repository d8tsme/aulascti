package com.primeira.api.controllers;

import com.primeira.api.empresas.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

//Annotations
@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroEmpresa dados) {
        Empresa a = empresaRepositorio.save(new Empresa(dados));
        Long id = a.getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        var lista = empresaRepositorio.findAll().stream().map(DadosListagemEmpresa::new)
                .toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoEmpresa dados) {
        if (!empresaRepositorio.existsById(dados.id())){
            return ResponseEntity.notFound().build();
        }
        Empresa a = empresaRepositorio.getReferenceById(dados.id());
        a.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if(!empresaRepositorio.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        empresaRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
