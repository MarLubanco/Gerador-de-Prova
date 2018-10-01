package com.br.unifil.gerador.de.prova.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Prova {

  @Id
  @GeneratedValue
  private Long id;

  private String materia;

  @OneToMany(cascade = CascadeType.ALL)
  private List<Questao> questoes;

  @OneToOne(cascade = CascadeType.ALL)
  private Professor professor;

  public Prova(Long id, String materia, List<Questao> questoes, Professor professor) {
    this.id = id;
    this.materia = materia;
    this.questoes = questoes;
    this.professor = professor;
  }

  public Prova() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMateria() {
    return materia;
  }

  public void setMateria(String materia) {
    this.materia = materia;
  }

  public List<Questao> getQuestoes() {
    return questoes;
  }

  public void setQuestoes(List<Questao> questoes) {
    this.questoes = questoes;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }
}
