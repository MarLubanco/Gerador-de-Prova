package com.br.unifil.gerador.de.prova.service;

import com.br.unifil.gerador.de.prova.model.Opcao;
import com.br.unifil.gerador.de.prova.repository.OpcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class OpcaoService {

    @Autowired
    OpcaoRepository opcaoRepository;

    /**
     * Recupera todas as opções cadastradas
     * @return
     */
    public List<Opcao> getAllOpcoes() {
        return opcaoRepository.findAll();
    }

    /**
     * Recupera uma opções a partir do id da opção
     * @param id
     * @return
     */
    public Optional<Opcao> getOpcao(Long id) {
        return opcaoRepository.findById(id);
    }

    /**
     * Salvar uma opção
     * @param opcao
     * @return
     */
    public Opcao saveOpcao(Opcao opcao) {
        return opcaoRepository.save(opcao);
    }

    /**
     * Atualizar um opção
     * @param id
     * @param opcao
     * @return
     */
    public Opcao atualizaOpcao(Long id, Opcao opcao) {
        return opcaoRepository.save(opcao);
    }

    /**
     * Deletar uma opção
     * @param id
     */
    public void deleteOpcao(Long id) {
        opcaoRepository.deleteById(id);
    }

}