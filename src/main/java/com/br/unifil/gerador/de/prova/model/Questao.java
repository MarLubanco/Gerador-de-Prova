package com.br.unifil.gerador.de.prova.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created by Surfista on 06/09/2018.
 */

@Entity
@Table(name = "QUESTAO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Questao {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String descricaoQuestao;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Opcao> opcoes;

    @NotEmpty
    private String categoria;

    @NotEmpty
    private String resposta;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Professor professor;

}
