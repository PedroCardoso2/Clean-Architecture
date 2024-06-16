package com.example.clean_code.application.usecases;

import com.example.clean_code.application.gateway.RepositorioUsuario;
import com.example.clean_code.domain.entities.usuario.Usuario;

import java.util.List;

public class ListarUsuario {
    public final RepositorioUsuario usuario;

    public ListarUsuario(RepositorioUsuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> listarUsuario(){
        return usuario.listarUsuarios();
    }
}
