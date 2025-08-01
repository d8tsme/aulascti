package com.primeira.api.controllers;

import com.primeira.api.animais.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

//Annotations
@RestController
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalRepositorio animalRepositorio;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroAnimal dados) {
        Animal a = animalRepositorio.save(new Animal(dados));
        Long id = a.getId();
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        var lista = animalRepositorio.findAll().stream().map(DadosListagemAnimal::new)
                .toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoAnimal dados) {
        if (!animalRepositorio.existsById(dados.id())){
            return ResponseEntity.notFound().build();
        }
        Animal a = animalRepositorio.getReferenceById(dados.id());
        a.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if(!animalRepositorio.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        animalRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
