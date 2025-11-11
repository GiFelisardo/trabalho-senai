package com.carros.atividade.grupo.carrosesi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carros.atividade.grupo.carrosesi.models.Endereco;
import com.carros.atividade.grupo.carrosesi.services.EnderecoService;


@RestController
public class EnderecoController {
    
    @Autowired
    public EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }

    @GetMapping("/find/{id}")
    public Endereco find(@PathVariable Integer id) {
        return enderecoService.findById(id);
    }

    
    
}
