package com.exemplo.front.albuns;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "album")
@Entity(name = "albuns")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Album {
    public Album(DadosCadastroAlbum dados) {
        this.nome = dados.nome();
        this.genero = dados.genero();
        this.banda = dados.banda();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    private String banda;

    public void atualizaInformacoes(DadosAlteracaoAlbum dados){
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.genero() != null) {
            this.genero = dados.genero();
        }
        if (dados.banda() != null) {
            this.banda = dados.banda();
        }
    }
}
