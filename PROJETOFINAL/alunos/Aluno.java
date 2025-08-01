package com.primeira.api.alunos;

//Annotations

import jakarta.persistence.*;
import lombok.*;

@Table(name = "aluno")
@Entity(name = "alunos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String turma;
    private Long matricula;

    public Aluno(DadosCadastroAluno dados) {
        this.nome = dados.nome();
        this.turma = dados.turma();
        this.matricula = dados.matricula();
    }

    public void atualizaInformacoes(DadosAlteracaoAluno dados) {
        if(dados.id() != null){
            this.id = dados.id();
        }
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.turma() != null){
            this.turma = dados.nome();
        }
        if(dados.matricula() != null){
            this.matricula = dados.matricula();
        }
    }
}
