package com.primeira.api.disciplinas;

public record DadosListagemDisciplina(Long id, String nome, String descricao) {
    public DadosListagemDisciplina(Disciplina dados) {
        this(dados.getId(), dados.getNome(), dados.getDescricao());
    }
}
