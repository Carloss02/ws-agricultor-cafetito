/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.controller;

import com.cafe.wsRest.postgresql.model.Vehiculo;
import com.cafe.wsRest.postgresql.service.VehiculoService;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TopVargas
 */
@RestController
@RequestMapping("/cafetito/vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoService vehiculoService;
    
    @Operation(summary = "obtener todos los vehiculos en base al estado en el sistema del beneficio de café")
    @GetMapping("/{estado}")
    public List<Vehiculo> getVehicleByStatus(
            @PathVariable Integer estado){
        return vehiculoService.getVehicleByStatus(estado);
    }
    
    @Operation(summary = "agrega un nuevo trasportista al sistema del beneficio de café")
    @PostMapping("/add")
    public Vehiculo addVehicle(
            @RequestBody Vehiculo v){
        return vehiculoService.addVehicle(v);
    }
}
