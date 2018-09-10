package com.br.unifil.gerador.de.prova.repository;

import com.br.unifil.gerador.de.prova.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {

  Optional<Professor> findById(Long id);

}
