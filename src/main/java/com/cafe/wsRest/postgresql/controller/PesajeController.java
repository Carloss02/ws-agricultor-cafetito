/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.controller;

import com.cafe.wsRest.dto.siguienteParcialidadDto;
import com.cafe.wsRest.postgresql.model.Pesaje;
import com.cafe.wsRest.postgresql.service.PesajeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TopVargas
 */
@RestController
@RequestMapping("/cafetito/pesaje")
public class PesajeController {
    
    @Autowired
    private PesajeService pesajeService;
    
    @Operation(summary = "Agregando resultado de pesaje de una parcialidad.")
    @PostMapping("/registrar")
    public siguienteParcialidadDto registrarPesaje(@RequestBody Pesaje pesaje){
        return pesajeService.addPesaje(pesaje);
    }
}
