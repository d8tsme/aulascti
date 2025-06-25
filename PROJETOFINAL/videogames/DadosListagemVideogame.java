package com.primeira.api.videogames;

public record DadosListagemVideogame(Long id, String nome, Long ano, String modelo, String marca, String capacidade) {
    public DadosListagemVideogame(Videogame dados) {this(dados.getId(), dados.getNome(), dados.getAno(), dados.getModelo(), dados.getMarca(), dados.getCapacidade());}
}
