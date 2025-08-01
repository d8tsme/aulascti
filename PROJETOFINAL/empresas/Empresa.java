package com.primeira.api.empresas;

//Annotations

import jakarta.persistence.*;
import lombok.*;

@Table(name = "empresa")
@Entity(name = "empresas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cnpj;
    private String tipo;

    public Empresa(DadosCadastroEmpresa dados) {
        this.nome = dados.nome();
        this.cnpj = dados.cnpj();
        this.tipo = dados.tipo();
    }

    public void atualizaInformacoes(DadosAlteracaoEmpresa dados) {
        if(dados.id() != null){
            this.id = dados.id();
        }
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.cnpj() != null){
            this.cnpj = dados.nome();
        }
        if(dados.tipo() != null){
            this.tipo = dados.tipo();
        }
    }
}
