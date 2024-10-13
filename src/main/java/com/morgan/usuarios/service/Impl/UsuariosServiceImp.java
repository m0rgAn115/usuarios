package com.morgan.usuarios.service.Impl;

import com.morgan.usuarios.models.Usuario;
import com.morgan.usuarios.repository.UsuarioRepository;
import com.morgan.usuarios.service.IUsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuariosServiceImp implements IUsuariosService {

    private UsuarioRepository usuarioRepository;


    @Override
    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario getUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario no encontrado")
        );
    }
}
