package com.edu.challenges.jornadaMilhas.Services;
import org.springframework.stereotype.Service;

import com.edu.challenges.jornadaMilhas.Model.Depoimento;
import com.edu.challenges.jornadaMilhas.Model.Usuario;
import com.edu.challenges.jornadaMilhas.Repository.UsuarioRepository;



@Service
public class UsuarioService {

    
    private final UsuarioRepository usuarioRepository;
    
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    
}
