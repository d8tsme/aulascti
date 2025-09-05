package com.exemplo.front.equipes;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "equipe")
@Entity(name = "equipes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Equipe {
    public Equipe(DadosCadastroEquipe dados) {
        this.nome = dados.nome();
        this.modalidade = dados.modalidade();
        this.torcedores = dados.torcedores();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String modalidade;
    private int torcedores;

    public void atualizaInformacoes(DadosAlteracaoEquipe dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.modalidade() != null) {
            this.modalidade = dados.modalidade();
        }

        if (dados.torcedores() != 0) {
            this.torcedores = dados.torcedores();
        }
    }
}
