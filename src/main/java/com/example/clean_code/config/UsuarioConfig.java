package com.example.clean_code.config;

import com.example.clean_code.application.gateway.RepositorioUsuario;
import com.example.clean_code.application.usecases.CriarUsuario;
import com.example.clean_code.application.usecases.ListarUsuario;
import com.example.clean_code.infra.gateway.RepositorioDeUsuarioJpa;
import com.example.clean_code.infra.gateway.UsuarioEntityMapper;
import com.example.clean_code.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {
    @Bean
    CriarUsuario criarUsuario(RepositorioUsuario usuario){
        return new CriarUsuario(usuario);
    }

    @Bean
    ListarUsuario listarUsuario(RepositorioUsuario usuario){ return new ListarUsuario(usuario);}

    @Bean
    RepositorioDeUsuarioJpa repositorioDeUsuarioJpa(UsuarioRepository repository, UsuarioEntityMapper mapper){
        return new RepositorioDeUsuarioJpa(repository, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper(){
        return new UsuarioEntityMapper();
    }


}
