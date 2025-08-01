package com.primeira.api.controllers;

import com.primeira.api.filmes.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

//Annotations
@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeRepositorio filmeRepositorio;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroFilme dados) {
        Filme f = filmeRepositorio.save(new Filme(dados));
        Long id = f.getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar() {
        var lista = filmeRepositorio.findAll().stream().map(DadosListagemFilme::new)
                .toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoFilme dados) {
        if (!filmeRepositorio.existsById(dados.id())) {
            return ResponseEntity.notFound().build();
        }
        Filme f = filmeRepositorio.getReferenceById(dados.id());
        f.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if (!filmeRepositorio.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        filmeRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

