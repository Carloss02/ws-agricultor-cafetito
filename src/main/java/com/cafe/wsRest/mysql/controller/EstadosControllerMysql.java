/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.EstadosMysql;
import com.cafe.wsRest.mysql.service.EstadosServiceMysql;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlo
 */
@RestController
@RequestMapping("/estados")
public class EstadosControllerMysql {
    @Autowired
    private EstadosServiceMysql estadosService;
    
    @Operation(summary = "Obtiene todos los estados")
    @GetMapping
    public List<EstadosMysql> getEstados(){
        return estadosService.getAllEstados();
    }
    
    @Operation(summary = "Obtiene estado por Id")
    @GetMapping("/{codigoEstado}")
    public Optional<EstadosMysql> getEstadoById(@PathVariable int codigoEstado){
        return estadosService.getEstadosById(codigoEstado);
    }
    
    @Operation(summary = "Crear un estado")
    @PostMapping
    public EstadosMysql addEstado(@RequestBody EstadosMysql estado){
        return estadosService.addEstado(estado);
    }
}
