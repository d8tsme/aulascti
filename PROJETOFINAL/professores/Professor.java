package com.primeira.api.professores;

//Annotations

import jakarta.persistence.*;
import lombok.*;

@Table(name = "professor")
@Entity(name = "professores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String disciplina;

    public Professor(DadosCadastroProfessor dados){
        this.nome = dados.nome();
        this.disciplina = dados.disciplina();
    }

    public void atualizaInformacoes(DadosAlteracaoProfessor dados){
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.disciplina() != null){
            this.disciplina = dados.disciplina();
        }
    }
}
