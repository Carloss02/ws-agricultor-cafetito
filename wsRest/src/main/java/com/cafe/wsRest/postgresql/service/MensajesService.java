/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.service;

import com.cafe.wsRest.postgresql.model.MensajesModel;
import com.cafe.wsRest.postgresql.repository.MensajesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class MensajesService {
    
    @Autowired
    private MensajesRepository mensajesRepository;
    
    public List<MensajesModel> getAllMensajes(){
        return mensajesRepository.findAll();
    }
    
    public MensajesModel enviarMensaje(MensajesModel mensaje){
        return mensajesRepository.save(mensaje);
    }
    
}
