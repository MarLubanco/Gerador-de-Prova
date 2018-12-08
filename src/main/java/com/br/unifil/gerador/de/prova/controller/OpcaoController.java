package com.br.unifil.gerador.de.prova.controller;

import com.br.unifil.gerador.de.prova.model.Opcao;
import com.br.unifil.gerador.de.prova.repository.OpcaoRepository;
import com.br.unifil.gerador.de.prova.service.OpcaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/opcoes")
public class OpcaoController {

    @Autowired
    OpcaoRepository opcaoRepository;

    @Autowired
    OpcaoService opcaoService;

    /**
     * Recupera todas as opções cadastradas
     * @return
     */
    @GetMapping
    public List<Opcao> getAllOpcoes() {
      return opcaoService.getAllOpcoes();
    }

    /**
     * Recupera uma opções a partir do id da opção
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Opcao> getOpcao(@PathVariable("id") Long id) {
      return opcaoService.getOpcao(id);
    }

    /**
     * Salvar uma opção
     * @param opcao
     * @return
     */
    @PostMapping
    public Opcao saveOpcao(@RequestBody Opcao opcao) {
      return opcaoService.saveOpcao(opcao);
    }

    /**
     * Atualizar um opção
     * @param id
     * @param opcao
     * @return
     */
    @PutMapping("/{id}")
    public Opcao atualizaOpcao(@PathVariable("id") Long id, @RequestBody Opcao opcao) {
      return opcaoService.atualizaOpcao(id, opcao);
    }

    /**
     * Deletar uma opção
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteOpcao(@PathVariable("id") Long id) {
      opcaoService.deleteOpcao(id);
    }

}

