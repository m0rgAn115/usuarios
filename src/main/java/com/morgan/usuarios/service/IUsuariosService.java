package com.morgan.usuarios.service;

import com.morgan.usuarios.models.Usuario;

public interface IUsuariosService {
    void crearUsuario(Usuario usuario);

    Usuario getUsuarioPorId(Long id);
}
