package com.br.unifil.gerador.de.prova.controller;

import com.br.unifil.gerador.de.prova.model.Prova;
import com.br.unifil.gerador.de.prova.repository.ProvaRepository;
import com.br.unifil.gerador.de.prova.service.ProvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provas")
public class ProvaController {

  @Autowired
  ProvaRepository provaRepository;

  @Autowired
  ProvaService provaService;

  /**
   * Recupera todos as provas.
   * @return
   */
  @GetMapping
  @PreAuthorize("hasRole('ADMIN')")
  public List<Prova> getAllProvaes() {
    return provaService.getAllProvaes();
  }

  /**
   * Recupera a prova pelo id.
   * @param id
   * @return
   */
  @GetMapping("/{id}")
  @PreAuthorize("hasRole('ADMIN')")
  public Optional<Prova> getProva(@PathVariable("id") Long id) {
    return provaService.getProva(id);
  }

  /**
   * Salvar prova.
   * @param prova
   * @return
   */
  @PostMapping
  @PreAuthorize("hasRole('ADMIN')")
  public Prova saveProva(@RequestBody Prova prova) {
    return provaService.saveProva(prova);
  }

  /**
   * Atualiza prova.
   * @param id
   * @param prova
   * @return
   */
  @PutMapping("/{id}")
  @PreAuthorize("hasRole('ADMIN')")
  public Prova atualizaProva(@PathVariable("id") Long id, @RequestBody Prova prova) {
    return provaService.atualizaProva(id, prova);
  }

  /**
   * Deleta prova pelo id.
   * @param id
   */
  @DeleteMapping("/{id}")
  @PreAuthorize("hasRole('ADMIN')")
  public void deleteProva(@PathVariable("id") Long id) {
    provaService.deleteProva(id);
  }
}

