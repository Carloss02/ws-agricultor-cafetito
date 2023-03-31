/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.VehiculosMysql;
import com.cafe.wsRest.mysql.service.VehiculosServiceMysql;
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
@RequestMapping("/vehiculos")
public class VehiculosControllerMysql {
    @Autowired
    private VehiculosServiceMysql vehiculoService;
    
    @Operation(summary = "obtiene todos los vehículos")
    @GetMapping
    public List<VehiculosMysql> getVehiculos(){
        return vehiculoService.getVehiculos();
    }
    
    @Operation(summary = "Obtiene un vehiculo")
    @GetMapping("/{placa}")
    public VehiculosMysql getVehiculoByPlaca(@PathVariable String placa){
        return vehiculoService.getVehiculoById(placa);
    }
    
    @Operation(summary = "Registrar un vehículo")
    @PostMapping
    public VehiculosMysql addVehiculo(@RequestBody VehiculosMysql vehiculo){
        return vehiculoService.addVehiculo(vehiculo);
    }
    
    @Operation(summary = "Editar un vehículo")
    @PutMapping
    public VehiculosMysql editVehiculo(@RequestBody VehiculosMysql vehiculo){
        return vehiculoService.editVehiculo(vehiculo);
    }
}
