package com.br.unifil.gerador.de.prova.service;

import com.br.unifil.gerador.de.prova.model.Professor;
import com.br.unifil.gerador.de.prova.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

  @Autowired
  ProfessorRepository professorRepository;

  /**
   * Recupera todos os professores.
   * @return
   */
  public List<Professor> getAllProfessores() {
    return professorRepository.findAll();
  }

  /**
   * Recupera o professor pelo id.
   * @param id
   * @return
   */
  public Optional<Professor> getProfessor(Long id) {
    return professorRepository.findById(id);
  }

  /**
   * Salvar professor.
   * @param professor
   * @return
   */
  public Professor saveProfessor( Professor professor) {
    return professorRepository.save(professor);
  }

  /**
   * Atualiza professor.
   * @param id
   * @param professor
   * @return
   */
  public Professor atualizaProfessor(Long id,  Professor professor) {
    return professorRepository.save(professor);
  }

  /**
   * Deleta professor pelo id.
   * @param id
   */
  public void deleteProfessor(Long id) {
    professorRepository.deleteById(id);
  }

}
