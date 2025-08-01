package com.primeira.api.filmes;

public record DadosListagemFilme(Long id, String titulo, String genero) {
    public DadosListagemFilme(Filme dados){ this(dados.getId(), dados.getTitulo(), dados.getGenero());}
}
