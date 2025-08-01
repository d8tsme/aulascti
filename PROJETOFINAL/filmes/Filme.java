package com.primeira.api.filmes;

import jakarta.persistence.*;
import lombok.*;

// Annotations
@Table(name = "filme")
@Entity(name = "filmes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String genero;

    public Filme(DadosCadastroFilme dados) {
        this.titulo = dados.titulo();
        this.genero = dados.genero();
    }

    public void atualizaInformacoes(DadosAlteracaoFilme dados) {
        if(dados.id() != null){
            this.id = dados.id();
        }
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.genero() != null){
            this.genero = dados.genero();
        }
    }
}
