package com.primeira.api.viagens;

public record DadosListagemViagem(Long id, String nome, Long ano, String modelo, String marca, String capacidade) {
    public DadosListagemViagem(Viagem dados) {this(dados.getId(), dados.getNome(), dados.getAno(), dados.getModelo(), dados.getMarca(), dados.getCapacidade());}
}
