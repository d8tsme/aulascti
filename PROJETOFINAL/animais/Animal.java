package com.primeira.api.animais;

//Annotations

import com.primeira.api.cidades.DadosAlteracaoCidade;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "animal")
@Entity(name = "animais")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long idade;

    public Animal(DadosCadastroAnimal dados) {
        this.nome = dados.nome();
        this.idade = dados.idade();
    }

    public void atualizaInformacoes(DadosAlteracaoAnimal dados){
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.idade() != null) {
            this.idade = dados.idade();
        }
    }
}
