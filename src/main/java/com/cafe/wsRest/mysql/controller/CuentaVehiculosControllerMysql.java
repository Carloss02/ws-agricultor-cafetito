/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.CuentaVehiculosMysql;
import com.cafe.wsRest.mysql.service.CuentaVehiculosServiceMysql;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlo
 */
@RestController
@RequestMapping("/vehiculosAsignados")
public class CuentaVehiculosControllerMysql {
    @Autowired
    private CuentaVehiculosServiceMysql CuentaVehiculosService;
    
    @Operation(summary = "obtiene todos los vehículos Asignados a una cuenta")
    @GetMapping
    public List<CuentaVehiculosMysql> getVehiculos(){
        return CuentaVehiculosService.getVehiculosAsignados();
    }
    
    @Operation(summary = "Obtiene un vehiculo asignado a una cuenta")
    @GetMapping("/{idVehiculoAsignado}")
    public Optional<CuentaVehiculosMysql> getVehiculo(@PathVariable int idVehiculoAsignado){
        return CuentaVehiculosService.getVehiculoAsginadoById(idVehiculoAsignado);
    }
    
    @Operation(summary = "Registrar un vehículo asignado a una cuenta")
    @PostMapping
    public CuentaVehiculosMysql addVehiculo(@RequestBody CuentaVehiculosMysql vehiculo){
        return CuentaVehiculosService.addVehiculoAsignado(vehiculo);
    }
    
    @Operation(summary = "Editar un vehículo asigando a una cuenta")
    @PutMapping
    public CuentaVehiculosMysql editVehiculo(@RequestBody CuentaVehiculosMysql vehiculo){
        return CuentaVehiculosService.editVehiculoAsignado(vehiculo);
    }
}
