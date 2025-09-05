package com.exemplo.front.albuns;

public record DadosListagemAlbum(Long id, String nome, String genero, String banda) {
    public DadosListagemAlbum(Album dados) { this(dados.getId(), dados.getNome(), dados.getGenero(), dados.getBanda());}
}
