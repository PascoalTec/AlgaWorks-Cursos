package com.algaworks.algatransito.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.algaworks.algatransito.domain.model.Proprietario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@RestController
public class ProprietarioController {
    
    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/proprietarios")
    public List<Proprietario> listar(){

        return entityManager.createQuery("from Proprietario", Proprietario.class).getResultList();
        
        // TypedQuery<Proprietario> query =  entityManager.createQuery("from Proprietario", Proprietario.class);
        // return query.getResultList()
    }
}
