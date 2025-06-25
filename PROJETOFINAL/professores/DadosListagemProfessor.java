package com.primeira.api.professores;

public record DadosListagemProfessor(Long id, String nome, String disciplina) {
    public DadosListagemProfessor(Professor dados) { this(dados.getId(), dados.getNome(), dados.getDisciplina());}
}
