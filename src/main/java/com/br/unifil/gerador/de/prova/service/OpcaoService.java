package com.br.unifil.gerador.de.prova.service;

import com.br.unifil.gerador.de.prova.model.Opcao;
import com.br.unifil.gerador.de.prova.repository.OpcaoRepository;
import com.br.unifil.gerador.de.prova.repository.OpcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by labinfo on 06/09/2018.
 */

@RestController
@RequestMapping("/opcoes")
public class OpcaoService {

    @Autowired
    OpcaoRepository opcaoRepository;

    @GetMapping
    public List<Opcao> getAllOpcoes() {
        return opcaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Opcao> getOpcao(@PathVariable("id") Long id) {
        return opcaoRepository.findById(id);
    }

    @PostMapping
    public Opcao saveOpcao(@RequestBody Opcao opcao) {
        return opcaoRepository.save(opcao);
    }

    @PutMapping("/{id}")
    public Opcao atualizaOpcao(@PathVariable("id") Long id, @RequestBody Opcao opcao) {
        return opcaoRepository.save(opcao);
    }

    @DeleteMapping("/{id}")
    public void deleteOpcao(@PathVariable("id") Long id) {
        opcaoRepository.deleteById(id);
    }

}