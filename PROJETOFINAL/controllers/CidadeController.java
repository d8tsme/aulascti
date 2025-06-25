package com.primeira.api.controllers;

import com.primeira.api.cidades.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

//Annotations
@RestController
@RequestMapping("/cidades")
public class CidadeController {
    @Autowired
    private CidadeRepositorio cidadeRepositorio;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroCidade dados) {
        Cidade p = cidadeRepositorio.save(new Cidade(dados));
        Long id = p.getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar() {
        var lista = cidadeRepositorio.findAll().stream().map(DadosListagemCidade::new)
                .toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoCidade dados) {
        if (!cidadeRepositorio.existsById(dados.id())){
            return ResponseEntity.notFound().build();
        }
        Cidade p = cidadeRepositorio.getReferenceById(dados.id());
        p.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if (!cidadeRepositorio.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        cidadeRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}