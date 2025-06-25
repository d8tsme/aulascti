package com.primeira.api.controllers;

import com.primeira.api.alunos.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

//Annotations
@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroAluno dados) {
        Aluno a = alunoRepositorio.save(new Aluno(dados));
        Long id = a.getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        var lista = alunoRepositorio.findAll().stream().map(DadosListagemAluno::new)
                .toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoAluno dados) {
        if (!alunoRepositorio.existsById(dados.id())){
            return ResponseEntity.notFound().build();
        }
        Aluno a = alunoRepositorio.getReferenceById(dados.id());
        a.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if(!alunoRepositorio.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        alunoRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
