/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.MensajesMysqlModel;
import com.cafe.wsRest.mysql.repository.MensajesMysqlRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class MensajesMysqlService {
    
    @Autowired
    private MensajesMysqlRepository mensajesMysqlRepository;
    
    public List<MensajesMysqlModel> getAllMensajes(){
        return mensajesMysqlRepository.findAll();
    }
    
    public MensajesMysqlModel enviarMensaje(MensajesMysqlModel mensaje){
        return mensajesMysqlRepository.save(mensaje);
    }
    
}
