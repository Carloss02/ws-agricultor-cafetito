/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.MensajesMysql;
import com.cafe.wsRest.mysql.repository.MensajesMysqlRepositoryMysql;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class MensajesServiceMysql {
    @Autowired
    private MensajesMysqlRepositoryMysql mensajesRepository;
    
    public Optional<MensajesMysql> getMensajeById(int idMensaje){
        return mensajesRepository.findById(idMensaje);
    }
    
    public List<MensajesMysql> getMensajes(){
        return mensajesRepository.findAll();
    }
    
    public MensajesMysql addMensaje(MensajesMysql mensaje){
        return mensajesRepository.save(mensaje);
    }
    
    public MensajesMysql editMensaje(MensajesMysql mensaje){
        return mensajesRepository.save(mensaje);
    }
}
