/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.UsuariosMysql;
import com.cafe.wsRest.mysql.repository.UsuariosRepositoryMysql;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class UsuariosServiceMysql {
    @Autowired 
    private UsuariosRepositoryMysql usuariosRepository; 
     
    public Optional<UsuariosMysql> getUsuariosById(int idAgricultor){
        return usuariosRepository.findById(idAgricultor);
    }
    
    public UsuariosMysql addUsuario(UsuariosMysql usuario){
        return usuariosRepository.save(usuario);
    }
    
    public UsuariosMysql editUsuario(UsuariosMysql usuario){
        return usuariosRepository.save(usuario);
    }
}
