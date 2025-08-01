package com.primeira.api.disciplinas;

//Annotations

import jakarta.persistence.*;
import lombok.*;

@Table(name = "disciplina")
@Entity(name = "disciplinas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    public Disciplina(DadosCadastroDisciplina dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
    }

    public void atualizaInformacoes(DadosAlteracaoDisciplina dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
    }
}
