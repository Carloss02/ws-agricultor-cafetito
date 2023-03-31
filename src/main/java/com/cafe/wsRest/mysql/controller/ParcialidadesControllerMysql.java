/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.dto.VehiculoEnRutaDto;
import com.cafe.wsRest.mysql.model.ParcialidadesMysql;
import com.cafe.wsRest.mysql.service.ParcialidadesServiceMysql;
import com.cafe.wsRest.postgresql.model.MensajesModel;
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
@RequestMapping("/parcialidades")
public class ParcialidadesControllerMysql {
    @Autowired
    private ParcialidadesServiceMysql parcialidadService;
    
    @Operation(summary = "obtiene todos los vehículos")
    @GetMapping
    public List<ParcialidadesMysql> getparcialidades(){
        return parcialidadService.getParcialidades();
    }
    
    @Operation(summary = "Obtiene una parcialidad")
    @GetMapping("/parcialidad/{idParcialidad}")
    public Optional<ParcialidadesMysql> getParcialidad(@PathVariable int idParcialidad){
        return parcialidadService.getParcialidadById(idParcialidad);
    }
    
    @Operation(summary = "Obtiene una parcialidad por IdVenta")
    @GetMapping("/{idVenta}")
    public List<ParcialidadesMysql> getParcialidadByIdVenta(@PathVariable Integer idVenta){
        return parcialidadService.getParcialidadByIdVenta(idVenta);
    }
    
    @Operation(summary = "Registrar una parcialidad")
    @PostMapping
    public ParcialidadesMysql addParcialidad(@RequestBody ParcialidadesMysql parcialidad){
        return parcialidadService.addParcialidad(parcialidad);
    }
    
    @Operation(summary = "Editar una parcialidad")
    @PutMapping
    public ParcialidadesMysql editParcialidad(@RequestBody ParcialidadesMysql parcialidad){
        return parcialidadService.editParcialidad(parcialidad);
    }
    
    @Operation(summary = "Enviar una Parcialidad")
    @PutMapping("/agricultor/enviarParcialidad")
    public MensajesModel enviarParcialidad(@RequestBody ParcialidadesMysql parcialidad){
        return parcialidadService.sendParcialidad(parcialidad);
    }
    
    @Operation(summary = "Obtiene una parcialidad por placa y estado En Ruta")
    @GetMapping("/agricultor/parcialidadEnRuta/{placa}")
    public VehiculoEnRutaDto getParcialidadEnRuta(@PathVariable String placa){
        System.out.println(placa + " - PLACA");
        return parcialidadService.getParcialidadEnRutaByPlaca(placa);
    }
    
}
