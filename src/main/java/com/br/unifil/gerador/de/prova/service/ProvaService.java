package com.br.unifil.gerador.de.prova.service;

import com.br.unifil.gerador.de.prova.model.Prova;
import com.br.unifil.gerador.de.prova.repository.ProvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provas")
public class ProvaService {


  @Autowired
  ProvaRepository provaRepository;

  /**
   * Recupera todos as provas.
   * @return
   */
  @GetMapping
  public List<Prova> getAllProvaes() {
    return provaRepository.findAll();
  }

  /**
   * Recupera a prova pelo id.
   * @param id
   * @return
   */
  @GetMapping("/{id}")
  public Optional<Prova> getProva(@PathVariable("id") Long id) {
    return provaRepository.findById(id);
  }

  /**
   * Salvar prova.
   * @param prova
   * @return
   */
  @PostMapping
  public Prova saveProva(@RequestBody Prova prova) {
    return provaRepository.save(prova);
  }

  /**
   * Atualiza prova.
   * @param id
   * @param prova
   * @return
   */
  @PutMapping("/{id}")
  public Prova atualizaProva(@PathVariable("id") Long id, @RequestBody Prova prova) {
    return provaRepository.save(prova);
  }

  /**
   * Deleta prova pelo id.
   * @param id
   */
  @DeleteMapping("/{id}")
  public void deleteProva(@PathVariable("id") Long id) {
    provaRepository.deleteById(id);
  }
}
