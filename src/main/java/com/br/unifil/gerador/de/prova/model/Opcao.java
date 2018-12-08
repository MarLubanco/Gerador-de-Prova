package com.br.unifil.gerador.de.prova.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Surfista on 06/09/2018.
 */

@Entity
@Table(name = "OPCAO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Opcao {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String opcao;

    private String opcaoImagem;
}
