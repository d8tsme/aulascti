package com.exemplo.front.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.exemplo.front.pessoas.*;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroPessoa dados) {
        var pessoa = new Pessoa(dados);
        repository.save(pessoa);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pessoa.getId()).toUri();
        return ResponseEntity.created(location).body(pessoa);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<DadosListagemPessoa>> listar() {
        var lista = repository.findAll().stream().map(DadosListagemPessoa::new).toList();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/alterar")
    @Transactional
    public ResponseEntity<?> alterar(@RequestBody DadosAlteracaoPessoa dados) {
        if (!repository.existsById(dados.id())) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrado");
        }
        var pessoa = repository.getReferenceById(dados.id());
        pessoa.atualizaInformacoes(dados);
        return ResponseEntity.ok(dados);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrado");
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> detalhar(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrado");
        }
        var pessoa = repository.getReferenceById(id);
        DadosListagemPessoa dados = new DadosListagemPessoa(pessoa);
        return ResponseEntity.ok(dados);
    }
}
