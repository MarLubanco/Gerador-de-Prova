package com.br.unifil.gerador.de.prova.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "PROFESSOR")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends AbstractEntity {

  @Id
  @GeneratedValue
  private Long id;

  @NotEmpty
  @Column(unique = true)
  private String user;

  @NotEmpty
  private String password;

  @NotEmpty
  private String nome;

}
