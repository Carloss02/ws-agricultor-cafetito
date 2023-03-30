/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.TransportistasVehiculoMysql;
import com.cafe.wsRest.mysql.repository.TransportistasVehiculoRepositoryMysql;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class TransportistasVehiculoServiceMysql {
    @Autowired
    private TransportistasVehiculoRepositoryMysql transportistasVehiculoRepository;
    
    public Optional<TransportistasVehiculoMysql> getTransportistaAsignadoById(int id){
        return transportistasVehiculoRepository.findById(id);
    }
    
    public List<TransportistasVehiculoMysql> getTransportistaAsignados(){
        return transportistasVehiculoRepository.findAll();
    }
    
    public TransportistasVehiculoMysql addTransportistaAsignado(TransportistasVehiculoMysql transportistaAsignado){
        return transportistasVehiculoRepository.save(transportistaAsignado);
    }
    
    public TransportistasVehiculoMysql editTransportistaAsignado(TransportistasVehiculoMysql transportistaAsignado){
        return transportistasVehiculoRepository.save(transportistaAsignado);
    }
    
    public List<TransportistasVehiculoMysql> prueba(Integer id){
        return transportistasVehiculoRepository.findByIdVehiculoAsignado(id);
    }
}
