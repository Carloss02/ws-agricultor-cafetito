/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.controller;

import com.cafe.wsRest.postgresql.model.Parcialidad;
import com.cafe.wsRest.postgresql.service.ParcialidadService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TopVargas
 */
@RestController
@RequestMapping("/cafetito/parcialidad")
public class ParcialidadController {
    
    @Autowired
    private ParcialidadService parcialiadService;
    
    @Operation(summary = "obtiene parcialidad por Id")
    @GetMapping("/id/{idParcialidad}")
    public Parcialidad getParcialidadById(@PathVariable int idParcialidad){
        return parcialiadService.getParcialidadById(idParcialidad);
    }
}
