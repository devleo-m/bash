package com.study.userproductcrud.controller;

import com.study.userproductcrud.entity.UsuarioEntity;
import com.study.userproductcrud.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping()
    public List<UsuarioEntity> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }

    @GetMapping("{id}")
    public UsuarioEntity listarUsuarioPorId(@PathVariable Long id){
        return usuarioService.buscarUsuarioPorId(id);
    }

    @PutMapping()
    public UsuarioEntity criarNovoUsuario(@RequestBody UsuarioEntity usuario){
        return usuarioService.criarUsuario(usuario);
    }

    @PostMapping("{id}")
    public UsuarioEntity mudarUsuarioPorId(@PathVariable Long id, @RequestBody UsuarioEntity usuario){
        return usuarioService.atualizarUsuario(id, usuario);
    }

    @DeleteMapping("{id}")
    public void deletarUsuario(@PathVariable Long id){
        usuarioService.excluirUsuario(id);
    }
}
