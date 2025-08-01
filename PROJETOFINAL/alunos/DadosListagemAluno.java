package com.primeira.api.alunos;

public record DadosListagemAluno(Long id, String nome, String turma, Long matricula) {
    public DadosListagemAluno(Aluno dados) { this(dados.getId(), dados.getNome(), dados.getTurma(), dados.getMatricula());}
}
