/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.CuentaVehiculosMysql;
import com.cafe.wsRest.mysql.repository.CuentaVehiculosRepositoryMysql;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class CuentaVehiculosServiceMysql {
    @Autowired
    private CuentaVehiculosRepositoryMysql cuentaVehiculosService;
    
    public Optional<CuentaVehiculosMysql> getVehiculoAsginadoById(int idVehiculoAsignado){
        return cuentaVehiculosService.findById(idVehiculoAsignado);
    }
    
    public List<CuentaVehiculosMysql> getVehiculosAsignados(){
        return cuentaVehiculosService.findAll();
    }
    
    public CuentaVehiculosMysql addVehiculoAsignado(CuentaVehiculosMysql vehiculoAsignado){
        return cuentaVehiculosService.save(vehiculoAsignado);
    }
    
    public CuentaVehiculosMysql editVehiculoAsignado(CuentaVehiculosMysql vehiculoAsignado){
        return cuentaVehiculosService.save(vehiculoAsignado);
    }
    
}
