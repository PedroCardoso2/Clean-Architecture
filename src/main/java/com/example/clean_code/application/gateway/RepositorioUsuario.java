package com.example.clean_code.application.gateway;

import com.example.clean_code.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioUsuario {
    //Cadastrar
    Usuario cadastrar(Usuario usuario);
    List<Usuario> listarUsuarios();
}
