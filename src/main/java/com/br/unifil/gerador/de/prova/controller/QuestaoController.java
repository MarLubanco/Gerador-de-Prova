package com.br.unifil.gerador.de.prova.controller;

import com.br.unifil.gerador.de.prova.model.Questao;
import com.br.unifil.gerador.de.prova.repository.QuestaoRepository;
import com.br.unifil.gerador.de.prova.service.QuestaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questoes")
public class QuestaoController {

  @Autowired
  QuestaoRepository questaoRepository;

  @Autowired
  QuestaoService questaoService;

  /**
   * Recupera todas as questões.
   *
   * @return
   */
  @GetMapping
  public List<Questao> getAllQuestoes() {
    return questaoService.getAllQuestoes();
  }

  /**
   * Recupera uma questão pelo id.
   *
   * @param id
   * @return
   */
  @GetMapping("/{id}")
  public Optional<Questao> getQuestao(@PathVariable("id") Long id) {
    return questaoService.getQuestao(id);
  }

  /**
   * Salva a questão
   *
   * @param questao
   * @return
   */
  @PostMapping
  public Questao saveQuestao(@RequestBody Questao questao) {
    return questaoService.saveQuestao(questao);
  }

  /**
   * Atualiaza a questão
   *
   * @param id
   * @param questao
   * @return
   */
  @PutMapping("/{id}")
  public Questao atualizaQuestao(@PathVariable("id") Long id, @RequestBody Questao questao) {
    return questaoService.atualizaQuestao(id, questao);
  }

  /**
   * Deleta questão pelo id.
   *
   * @param id
   */
  @DeleteMapping("/{id}")
  public void deleteQuestao(@PathVariable("id") Long id) {
    questaoService.deleteQuestao(id);
  }

  //http://localhost:8080/questoes/categoria/Frontend?categoria=Frontend

  /**
   * Recupera todas as questões de acordo com a entrada que o professor deseja,
   * realizando um filtro com o tipo de categoria da questão
   *
   * @param categoria
   * @return
   */
  @GetMapping("/categoria/{categoriaSelecionada}")
  public List<Questao> getQuestaoPorCategoria(@RequestParam(value = "categoria") String categoria) {
    return questaoService.getQuestaoPorCategoria(categoria);
  }

//    @GetMapping("/professor/{professorSelecionado}")
//    public List<Questao> getQuestoesDeProfessor(@RequestParam(value = "professor") String professor) {
//        return questaoService.findByProfessor(professor);
//    }

}

