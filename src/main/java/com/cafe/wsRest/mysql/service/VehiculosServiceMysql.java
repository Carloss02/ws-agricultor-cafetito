/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.VehiculosMysql;
import com.cafe.wsRest.mysql.repository.VehiculosRepositoryMysql;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */

@Service
public class VehiculosServiceMysql {
    @Autowired
    private VehiculosRepositoryMysql vehiculosRepository;
    
    public VehiculosMysql getVehiculoById(String placa){
        return vehiculosRepository.findByPlaca(placa);
    }
    
    public List<VehiculosMysql> getVehiculos(){
        return vehiculosRepository.findAll();
    }
    
    public VehiculosMysql addVehiculo(VehiculosMysql vehiculo){
        return vehiculosRepository.save(vehiculo);
    }
    
    public VehiculosMysql editVehiculo(VehiculosMysql vehiculo){
        return vehiculosRepository.save(vehiculo);
    }
}
