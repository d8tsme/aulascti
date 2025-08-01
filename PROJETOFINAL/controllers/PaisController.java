package com.primeira.api.controllers;

import com.primeira.api.paises.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

//Annotations
@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private PaisRepositorio paisRepositorio;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroPais dados) {
        Pais p = paisRepositorio.save(new Pais(dados));
        Long id = p.getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar() {
        var lista = paisRepositorio.findAll().stream().map(DadosListagemPais::new)
                .toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoPais dados) {
        if (!paisRepositorio.existsById(dados.id())){
            return ResponseEntity.notFound().build();
        }
        Pais p = paisRepositorio.getReferenceById(dados.id());
        p.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if (!paisRepositorio.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        paisRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
