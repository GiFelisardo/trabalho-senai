package com.carros.atividade.grupo.carrosesi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carros.atividade.grupo.carrosesi.models.Usuario;
import com.carros.atividade.grupo.carrosesi.services.UsuarioService;


@RestController
public class UsuarioController {
    @Autowired
    public UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public Usuario save(@RequestBody Usuario usuario, @RequestParam  String senha, @RequestParam String confSenha) {
        return usuarioService.cadastro(usuario, senha, confSenha);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email,senha);
    }
    
}
