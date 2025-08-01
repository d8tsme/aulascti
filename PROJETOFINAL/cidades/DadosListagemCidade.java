package com.primeira.api.cidades;

public record DadosListagemCidade(Long id, String nome, String ddd) {
    public DadosListagemCidade(Cidade dados) {
        this(dados.getId(), dados.getNome(), dados.getDdd());
    }
}