/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.TransportistaMysql;
import com.cafe.wsRest.mysql.repository.TransportistaRepositoryMysql;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class TransportistaServiceMysql {
    @Autowired
    private TransportistaRepositoryMysql transportistaRepository;
    
    public Optional<TransportistaMysql> getTransportistaById(String noLicencia){
        return transportistaRepository.findById(noLicencia);
    }
    
    public List<TransportistaMysql> getTransportistas(){
        return transportistaRepository.findAll();
    }
    
    public TransportistaMysql addTransportista(TransportistaMysql transportista){
        return transportistaRepository.save(transportista);
    }
    
    public TransportistaMysql editTransportista(TransportistaMysql transportista){
        return transportistaRepository.save(transportista);
    }
}
