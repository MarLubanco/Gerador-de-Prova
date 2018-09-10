package com.br.unifil.gerador.de.prova.service;

import com.br.unifil.gerador.de.prova.model.Professor;
import com.br.unifil.gerador.de.prova.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professores")
public class ProfessorService {

  @Autowired
  ProfessorRepository professorRepository;

  @GetMapping
  public List<Professor> getAllProfessores() {
    return professorRepository.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Professor> getProfessor(@PathVariable("id") Long id) {
    return professorRepository.findById(id);
  }

  @PostMapping
  public Professor saveProfessor(@RequestBody Professor professor) {
    return professorRepository.save(professor);
  }

  @PutMapping("/{id}")
  public Professor atualizaProfessor(@PathVariable("id") Long id, @RequestBody Professor professor) {
    return professorRepository.save(professor);
  }

  @DeleteMapping("/{id}")
  public void deleteProfessor(@PathVariable("id") Long id) {
    professorRepository.deleteById(id);
  }

}
