package com.algaworks.algatransito.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algatransito.domain.model.Proprietario;

@RestController
public class ProprietarioController {
    
    @GetMapping("/proprietarios")
    public List<Proprietario> listar(){
        var proprietario1 = new Proprietario();

        proprietario1.setId(1L);
        proprietario1.setNome("João");
        proprietario1.setTelefone("34 99999-1111");
        proprietario1.setEmail("joaodascouves@algaworks.com");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Maria");
        proprietario2.setTelefone("11 97777-1111");
        proprietario2.setEmail("mariadasilva@algaworks.com");

        return Arrays.asList(proprietario1, proprietario2);
        
    }
}
