package com.exemplo.front.controllers;
import com.exemplo.front.equipes.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/equipes")
public class EquipeController {
    @Autowired
    private EquipeRepository repository;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroEquipe dados) {
        var equipe = new Equipe(dados);
        repository.save(equipe);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(equipe.getId()).toUri();
        return  ResponseEntity.created(location).body(equipe);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<DadosListagemEquipe>> listar() {
        var lista = repository.findAll().stream().map(DadosListagemEquipe::new).toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoEquipe dados) {
        if (!repository.existsById(dados.id())) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipe não encontrado");
        }
        var equipe = repository.getReferenceById(dados.id());
        equipe.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipe não encontrado");
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> detalhar(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipe não encontrado");
        }
        var equipe = repository.getReferenceById(id);
        DadosListagemEquipe dados = new DadosListagemEquipe(equipe);
        return ResponseEntity.ok(dados);
    }
}