package com.br.unifil.gerador.de.prova.controller;

import com.br.unifil.gerador.de.prova.model.Professor;
import com.br.unifil.gerador.de.prova.repository.ProfessorRepository;
import com.br.unifil.gerador.de.prova.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

  @Autowired
  ProfessorRepository professorRepository;

  @Autowired
  ProfessorService professorService;

  /**
   * Recupera todos os professores.
   * @return
   */
  @GetMapping
  public List<Professor> getAllProfessores() {
    return professorService.getAllProfessores();
  }

  /**
   * Recupera o professor pelo id.
   * @param id
   * @return
   */
  @GetMapping("/{id}")
  public Optional<Professor> getProfessor(@PathVariable("id") Long id) {
    return professorService.getProfessor(id);
  }

  /**
   * Salvar professor.
   * @param professor
   * @return
   */
  @PostMapping
  public Professor saveProfessor(@RequestBody Professor professor) {
    return professorService.saveProfessor(professor);
  }

  /**
   * Atualiza professor.
   * @param id
   * @param professor
   * @return
   */
  @PutMapping("/{id}")
  public Professor atualizaProfessor(@PathVariable("id") Long id, @RequestBody Professor professor) {
    return professorService.atualizaProfessor(id, professor);
  }

  /**
   * Deleta professor pelo id.
   * @param id
   */
  @DeleteMapping("/{id}")
  public void deleteProfessor(@PathVariable("id") Long id) {
    professorService.deleteProfessor(id);
  }

}
