package com.exemplo.front.equipes;

public record DadosListagemEquipe(Long id, String nome, String modalidade, int torcedores) {
    public DadosListagemEquipe(Equipe dados) { this(dados.getId(), dados.getNome(), dados.getModalidade(), dados.getTorcedores());}
}
