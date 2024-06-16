package com.example.clean_code.application.usecases;

import com.example.clean_code.application.gateway.RepositorioUsuario;
import com.example.clean_code.domain.entities.usuario.Usuario;

public class CriarUsuario {

    private final RepositorioUsuario repositorio;

    public CriarUsuario(RepositorioUsuario usuario) {
        this.repositorio = usuario;
    }

    public Usuario cadastrar(Usuario usuario){
        return repositorio.cadastrar(usuario);
    }


}
