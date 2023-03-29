/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.TransportistasVehiculoMysql;
import com.cafe.wsRest.mysql.service.TransportistasVehiculoServiceMysql;
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
@RequestMapping("/transportistasAsignados")
public class TransportistasVehiculoControllerMysql {
    @Autowired
    private TransportistasVehiculoServiceMysql transportistaVehiculoService;
    
    @Operation(summary = "obtiene todos los transportistas asignados a un vehiculo")
    @GetMapping
    public List<TransportistasVehiculoMysql> getVehiculos(){
        return transportistaVehiculoService.getTransportistaAsignados();
    }
    
    @Operation(summary = "Obtiene un transportista asignado a un vehiculo")
    @GetMapping("/{id}")
    public Optional<TransportistasVehiculoMysql> getVehiculo(@PathVariable int id){
        return transportistaVehiculoService.getTransportistaAsignadoById(id);
    }
    
    @Operation(summary = "Registrar un Transportista asignado a un vehiculo")
    @PostMapping
    public TransportistasVehiculoMysql addVehiculo(@RequestBody TransportistasVehiculoMysql transportistaAsignado){
        return transportistaVehiculoService.addTransportistaAsignado(transportistaAsignado);
    }
    
    @Operation(summary = "Editar un transportista asignado a un vehiculo")
    @PutMapping
    public TransportistasVehiculoMysql editVehiculo(@RequestBody TransportistasVehiculoMysql transportistaAsignado){
        return transportistaVehiculoService.editTransportistaAsignado(transportistaAsignado);
    }
}
