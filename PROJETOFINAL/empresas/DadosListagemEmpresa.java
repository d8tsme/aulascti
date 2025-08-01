package com.primeira.api.empresas;

public record DadosListagemEmpresa(Long id, String nome, String cnpj, String tipo) {
    public DadosListagemEmpresa(Empresa dados) { this(dados.getId(), dados.getNome(), dados.getCnpj(), dados.getTipo());}
}
