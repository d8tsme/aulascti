package com.exemplo.front.controllers;

import com.exemplo.front.albuns.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/albuns")
public class AlbumController {
    @Autowired
    private AlbumRepository repository;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroAlbum dados) {
        var album = new Album(dados);
        repository.save(album);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(album.getId()).toUri();
        return  ResponseEntity.created(location).body(album);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<DadosListagemAlbum>> listar() {
        var lista = repository.findAll().stream().map(DadosListagemAlbum::new).toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoAlbum dados) {
        if (!repository.existsById(dados.id())) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Album não encontrado");
        }
        var album = repository.getReferenceById(dados.id());
        album.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Album não encontrado");
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> detalhar(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Album não encontrado");
        }
        var album = repository.getReferenceById(id);
        DadosListagemAlbum dados = new DadosListagemAlbum(album);
        return ResponseEntity.ok(dados);
    }
}