package com.primeira.api.paises;

//Annotations

import jakarta.persistence.*;
import lombok.*;

@Table(name = "pais")
@Entity(name = "paises")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String ddi;
    private String foto;

    public Pais(DadosCadastroPais dados) {
        this.nome = dados.nome();
        this.ddi = dados.ddi();
        this.foto = dados.foto();
    }

    public void atualizaInformacoes(DadosAlteracaoPais dados) {
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.ddi() != null) {
            this.ddi = dados.ddi();
        }
        if (dados.foto() != null) {
            this.foto = dados.foto();
        }
    }
}
