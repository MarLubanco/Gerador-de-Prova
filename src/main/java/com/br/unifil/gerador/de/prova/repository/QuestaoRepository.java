package com.br.unifil.gerador.de.prova.repository;

import com.br.unifil.gerador.de.prova.model.Professor;
import com.br.unifil.gerador.de.prova.model.Questao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by labinfo on 06/09/2018.
 */
public interface QuestaoRepository extends JpaRepository<Questao, Long> {

    Optional<Questao> findById(Long id);

    List<Questao> findByCategoria(String categoria);

//    List<Questao> findByProfessor(String professor);

}
