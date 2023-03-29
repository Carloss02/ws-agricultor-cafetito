/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.service;

import com.cafe.wsRest.postgresql.model.Transportista;
import com.cafe.wsRest.postgresql.repository.TransportistaRepository;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TopVargas
 */
@Service
public class TransportistaService {
    
    @Autowired
    private TransportistaRepository transportistaRepository;
    
    @Autowired
    private BitacoraService bitacoraService;
    
    public List<Transportista> getCarrierByStatus(Integer estado){
        return transportistaRepository.findByEstado(estado);
    }
    
    public Transportista addCarrier(Transportista t){
        t.setEstado(1);
        t.setFechaModificacion(new Date());
        Transportista nuevo = transportistaRepository.save(t);
        
        bitacoraService.addRecord("transportista", nuevo.getLicencia(), 'I', t, 2);
        
        return nuevo;       
    }
}
