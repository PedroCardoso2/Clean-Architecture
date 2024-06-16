package com.example.clean_code.infra.controller;

import com.example.clean_code.application.usecases.CriarUsuario;
import com.example.clean_code.application.usecases.ListarUsuario;
import com.example.clean_code.domain.entities.usuario.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuario criarUsuario;
    private final ListarUsuario listarUsuario;

    public UsuarioController(CriarUsuario criarUsuario, ListarUsuario listarUsuario) {
        this.criarUsuario = criarUsuario;
        this.listarUsuario = listarUsuario;
    }

    @PostMapping
    public UsuarioDto cadastrarUsuario(@RequestBody UsuarioDto dto) {
        Usuario salvo = criarUsuario.cadastrar(new Usuario(dto.cpf(), dto.nome(), dto.nascimento(),dto.email()));

        return new UsuarioDto(salvo.getCpf(), salvo.getNome(), salvo.getNascimento(), salvo.getEmail());
    }

    @GetMapping
    public List<UsuarioDto> listarUsuarios(){
        return listarUsuario.listarUsuario().stream()
                .map(us -> new UsuarioDto(us.getCpf(), us.getNome(), us.getNascimento(), us.getEmail()))
                .collect(Collectors.toList());
    }



}