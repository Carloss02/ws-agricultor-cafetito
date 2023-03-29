/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.EstadosMysql;
import com.cafe.wsRest.mysql.repository.EstadosRepositoryMysql;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class EstadosServiceMysql {
    @Autowired
    private EstadosRepositoryMysql estadosRepository;
    
    public List<EstadosMysql> getAllEstados(){
        return  estadosRepository.findAll();
    }
    
    public Optional<EstadosMysql> getEstadosById(int codigoEstado){
        return estadosRepository.findById(codigoEstado);
    }
    
    public EstadosMysql addEstado(EstadosMysql estado){
        return estadosRepository.save(estado);
    }
    
}
