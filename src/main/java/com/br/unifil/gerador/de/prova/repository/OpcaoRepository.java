package com.br.unifil.gerador.de.prova.repository;

import com.br.unifil.gerador.de.prova.model.Opcao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by labinfo on 06/09/2018.
 */
public interface OpcaoRepository extends JpaRepository<Opcao, Long> {

    Optional<Opcao> findById(Long id);

}
