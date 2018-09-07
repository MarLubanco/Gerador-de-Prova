package com.br.unifil.gerador.de.prova.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by labinfo on 06/09/2018.
 */

@Entity
public class Opcao {

    @Id
    @GeneratedValue
    private Long id;

    private String opcao;

    private String opcaoImagem;

    public Opcao() {

    }

    public Opcao(Long id, String opcao, String opcaoImagem) {
        this.id = id;
        this.opcao = opcao;
        this.opcaoImagem = opcaoImagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public String getOpcaoImagem() {
        return opcaoImagem;
    }

    public void setOpcaoImagem(String opcaoImagem) {
        this.opcaoImagem = opcaoImagem;
    }
}
