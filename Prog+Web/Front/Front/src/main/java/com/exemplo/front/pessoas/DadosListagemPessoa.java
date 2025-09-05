package com.exemplo.front.pessoas;

public record DadosListagemPessoa(Long id, String nome, String cpf) {
    public DadosListagemPessoa(Pessoa dados) {
        this(dados.getId(), dados.getNome(), dados.getCpf());
    }
}
