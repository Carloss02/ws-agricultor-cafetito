/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.UsuariosMysql;
import com.cafe.wsRest.mysql.service.UsuariosServiceMysql;
import io.swagger.v3.oas.annotations.Operation;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlo
 */
@RestController
@RequestMapping("/usuarios")
public class UsuariosControllerMysql {
    @Autowired
    private UsuariosServiceMysql usuarioService;
    
    @Operation(summary = "Obtiene un usuario por Id")
    @GetMapping("{idAgricultor}")
    public Optional<UsuariosMysql> getUsuarioById(@PathVariable int idAgricultor){
        return usuarioService.getUsuariosById(idAgricultor);
    }
    
    @Operation(summary = "Crea un nuevo usuario")
    @PostMapping
    public UsuariosMysql addUsuario(@RequestBody UsuariosMysql usuario){
        return usuarioService.addUsuario(usuario);
    }
    
    @Operation(summary = "Edita un usuario existente")
    @PutMapping
    public UsuariosMysql editUsuario(@RequestBody UsuariosMysql usuario){
        return usuarioService.editUsuario(usuario);
    }
}
