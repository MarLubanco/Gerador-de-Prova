package com.br.unifil.gerador.de.prova.service;

import com.br.unifil.gerador.de.prova.model.Prova;
import com.br.unifil.gerador.de.prova.repository.ProvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class ProvaService {


  @Autowired
  ProvaRepository provaRepository;

  /**
   * Recupera todos as provas.
   * @return
   */
  public List<Prova> getAllProvaes() {
    return provaRepository.findAll();
  }

  /**
   * Recupera a prova pelo id.
   * @param id
   * @return
   */
  public Optional<Prova> getProva(Long id) {
    return provaRepository.findById(id);
  }

  /**
   * Salvar prova.
   * @param prova
   * @return
   */
  public Prova saveProva(Prova prova) {
    return provaRepository.save(prova);
  }

  /**
   * Atualiza prova.
   * @param id
   * @param prova
   * @return
   */
  public Prova atualizaProva(Long id, Prova prova) {
    return provaRepository.save(prova);
  }

  /**
   * Deleta prova pelo id.
   * @param id
   */
  public void deleteProva(Long id) {
    provaRepository.deleteById(id);
  }
}
