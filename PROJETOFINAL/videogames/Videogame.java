package com.primeira.api.videogames;

//Annotations

import jakarta.persistence.*;
import lombok.*;

@Table(name = "videogame")
@Entity(name = "videogames")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String modelo;
    private String marca;
    private String capacidade;
    private Long ano;

    public Videogame(DadosCadastroVideogame dados) {
        this.nome = dados.nome();
        this.modelo = dados.modelo();
        this.marca = dados.marca();
        this.capacidade = dados.capacidade();
        this.ano = dados.ano();
    }

    public void atualizaInformacoes(DadosAlteracaoVideogame dados){
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.modelo() != null) {
            this.modelo = dados.modelo();
        }
        if (dados.marca() != null) {
            this.marca = dados.marca();
        }
        if (dados.capacidade() != null) {
            this.capacidade = dados.capacidade();
        }
        if (dados.ano() != null) {
            this.ano = dados.ano();
        }
        }
    }
