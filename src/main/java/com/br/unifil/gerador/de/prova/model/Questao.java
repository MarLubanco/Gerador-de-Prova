package com.br.unifil.gerador.de.prova.model;

import javax.persistence.*;
import java.util.Base64;
import java.util.List;

/**
 * Created by labinfo on 06/09/2018.
 */

@Entity
public class Questao {

    @Id
    @GeneratedValue
    private Long id;

    private String descricaoQuestao;

    @OneToMany( cascade = CascadeType.ALL)
    private List<Opcao> opcoes;

    private String categoria;

    private String resposta;

    @ManyToOne(cascade = CascadeType.ALL)
    private Professor professor;

//    private Base64 imagem;

    public Questao() {

    }

    public Questao(Long id, String descricaoQuestao, List<Opcao> opcoes, String categoria, String resposta, Professor professor) {
        this.id = id;
        this.descricaoQuestao = descricaoQuestao;
        this.opcoes = opcoes;
        this.categoria = categoria;
        this.resposta = resposta;
        this.professor = professor;
//        this.imagem = imagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoQuestao() {
        return descricaoQuestao;
    }

    public void setDescricaoQuestao(String descricaoQuestao) {
        this.descricaoQuestao = descricaoQuestao;
    }

    public List<Opcao> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<Opcao> opcoes) {
        this.opcoes = opcoes;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //    public Base64 getImagem() {
//        return imagem;
//    }
//
//    public void setImagem(Base64 imagem) {
//        this.imagem = imagem;
//    }
}
