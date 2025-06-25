package com.primeira.api.controllers;

import com.primeira.api.disciplinas.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

//Annotations
@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaRepositorio disciplinaRepositorio;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity< ?> cadastrar(@RequestBody DadosCadastroDisciplina dados) {
        Disciplina p = disciplinaRepositorio.save(new Disciplina(dados));
        Long id = p.getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar() {
        var lista = disciplinaRepositorio.findAll().stream().map(DadosListagemDisciplina::new)
                .toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoDisciplina dados) {
        if (!disciplinaRepositorio.existsById(dados.id())){
            return ResponseEntity.notFound().build();
        }
        Disciplina p = disciplinaRepositorio.getReferenceById(dados.id());
        p.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if (!disciplinaRepositorio.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        disciplinaRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}