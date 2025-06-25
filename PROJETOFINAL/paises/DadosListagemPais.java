package com.primeira.api.paises;

public record DadosListagemPais(Long id, String nome, String ddi, String foto) {
    public DadosListagemPais(Pais dados) {
        this(dados.getId(), dados.getNome(), dados.getDdi(), dados.getFoto());
    }
}
