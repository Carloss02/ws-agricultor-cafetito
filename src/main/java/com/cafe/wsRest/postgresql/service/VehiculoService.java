/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.service;

import com.cafe.wsRest.postgresql.model.Vehiculo;
import com.cafe.wsRest.postgresql.repository.VehiculoRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TopVargas
 */
@Service
public class VehiculoService {
    
    @Autowired
    private VehiculoRepository vehiculoRepository;
    
    @Autowired
    private BitacoraService bitacoraService;
    
    public List<Vehiculo> getVehicleByStatus(Integer estado){
        return vehiculoRepository.findByEstado(estado);
    }
    
    public Vehiculo addVehicle(Vehiculo v){
        v.setEstado(4);
        v.setFechaCreacion(new Date());
        Vehiculo nuevo = vehiculoRepository.save(v);
        
        bitacoraService.addRecord("transportista", nuevo.getPlaca(), 'I', v, 2);
        return nuevo;
    }
}
