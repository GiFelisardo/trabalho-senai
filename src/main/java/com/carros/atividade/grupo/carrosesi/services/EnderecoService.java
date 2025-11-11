package com.carros.atividade.grupo.carrosesi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carros.atividade.grupo.carrosesi.models.Endereco;
import com.carros.atividade.grupo.carrosesi.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    public EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco findById(Integer id) {
        return enderecoRepository.findById(id).get();
    }    

}