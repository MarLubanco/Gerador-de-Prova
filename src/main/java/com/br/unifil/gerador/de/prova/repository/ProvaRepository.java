package com.br.unifil.gerador.de.prova.repository;

import com.br.unifil.gerador.de.prova.model.Prova;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProvaRepository extends JpaRepository<Prova, Long> {

  List<Prova> findByMateria(String materia);

  Optional<Prova> findById(Long id);
}
