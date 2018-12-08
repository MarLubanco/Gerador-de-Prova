package com.br.unifil.gerador.de.prova.service;

import com.br.unifil.gerador.de.prova.model.Questao;
import com.br.unifil.gerador.de.prova.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by labinfo on 06/09/2018.
 */

@Service
public class QuestaoService {

    @Autowired
    QuestaoRepository questaoRepository;

    /**
     * Recupera todas as questões.
     * @return
     */
    public List<Questao> getAllQuestoes() {
        return questaoRepository.findAll();
    }

    /**
     * Recupera uma questão pelo id.
     * @param id
     * @return
     */
    public Optional<Questao> getQuestao(Long id) {
        return questaoRepository.findById(id);
    }

    /**
     * Salva a questão
     * @param questao
     * @return
     */
    public Questao saveQuestao(Questao questao) {
        return questaoRepository.save(questao);
    }

    /**
     * Atualiaza a questão
     * @param id
     * @param questao
     * @return
     */
    public Questao atualizaQuestao(Long id, Questao questao) {
        return questaoRepository.save(questao);
    }

    /**
     * Deleta questão pelo id.
     * @param id
     */
    public void deleteQuestao(Long id) {
        questaoRepository.deleteById(id);
    }

    //http://localhost:8080/questoes/categoria/Frontend?categoria=Frontend

    /**
     * Recupera todas as questões de acordo com a entrada que o professor deseja,
     * realizando um filtro com o tipo de categoria da questão
     * @param categoria
     * @return
     */
    public List<Questao> getQuestaoPorCategoria( String categoria) {
        return questaoRepository.findByCategoria(categoria);
    }

//    @GetMapping("/professor/{professorSelecionado}")
//    public List<Questao> getQuestoesDeProfessor(@RequestParam(value = "professor") String professor) {
//        return questaoRepository.findByProfessor(professor);
//    }

}
