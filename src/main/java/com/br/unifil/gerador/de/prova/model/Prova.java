package com.br.unifil.gerador.de.prova.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "PROVA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prova {

  @Id
  @GeneratedValue
  private Long id;

  @NotEmpty
  @Size(max = 300)
  private String materia;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Questao> questoes;

  @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  private Professor professor;

}
