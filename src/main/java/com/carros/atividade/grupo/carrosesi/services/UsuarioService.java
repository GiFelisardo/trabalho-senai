package com.carros.atividade.grupo.carrosesi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carros.atividade.grupo.carrosesi.models.Usuario;
import com.carros.atividade.grupo.carrosesi.repositories.UsuarioRepository;

@Service
public class UsuarioService {
        @Autowired
    public UsuarioRepository usuarioRepository;
    
    public Usuario cadastro (Usuario usuario, String senha, String confSenha) {
    if(senha.equals(confSenha)) {
        return usuarioRepository.save(usuario);
    }
    return null;
    }

    public String login(String email, String senha){
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario != null && senha.equals(usuario.getSenha())) {
            return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
    }

    public boolean atualizarBoolean(Usuario usuario, Integer id) {
        Usuario e = usuarioRepository.findById(id).get();
        if (usuarioRepository.existsById(id)){
            usuario.setId(id);
            usuarioRepository.save(usuario);
            return true;
        }
        return false;
    }

}
