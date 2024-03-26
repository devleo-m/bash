package com.study.userproductcrud.service;

import com.study.userproductcrud.entity.UsuarioEntity;

import java.util.List;

public interface UsuarioService {
    UsuarioEntity criarUsuario(UsuarioEntity usuario);
    UsuarioEntity buscarUsuarioPorId(Long id);
    UsuarioEntity atualizarUsuario(Long id, UsuarioEntity usuario);
    void excluirUsuario(Long id);
    List<UsuarioEntity> listarUsuarios();

}
