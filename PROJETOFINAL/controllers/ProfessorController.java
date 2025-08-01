package com.primeira.api.controllers;

//Annotations

import com.primeira.api.professores.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorRepositorio professorRepositorio;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroProfessor dados){
        Professor p = professorRepositorio.save(new Professor(dados));
        Long id = p.getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        var lista = professorRepositorio.findAll().stream().map(DadosListagemProfessor::new)
                .toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoProfessor dados){
        if(!professorRepositorio.existsById(dados.id())){
            return ResponseEntity.notFound().build();
        }
        Professor p = professorRepositorio.getReferenceById(dados.id());
        p.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id){
        if(!professorRepositorio.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        professorRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
