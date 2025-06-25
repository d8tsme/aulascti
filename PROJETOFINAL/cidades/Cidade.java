package com.primeira.api.cidades;

//Annotations

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cidade")
@Entity(name = "cidades")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String ddd;

    public Cidade(DadosCadastroCidade dados) {
        this.nome = dados.nome();
        this.ddd = dados.ddd();
    }

    public void atualizaInformacoes(DadosAlteracaoCidade dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.ddd() != null) {
            this.ddd = dados.ddd();
        }
    }
}

