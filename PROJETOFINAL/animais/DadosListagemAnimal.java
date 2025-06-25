package com.primeira.api.animais;

public record DadosListagemAnimal(Long id, String nome, Long idade) {
    public DadosListagemAnimal(Animal dados) {this(dados.getId(), dados.getNome(), dados.getIdade());}
}
