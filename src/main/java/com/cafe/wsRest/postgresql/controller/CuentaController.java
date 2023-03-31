/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.controller;

import com.cafe.wsRest.dto.estadoCuentaDto;
import com.cafe.wsRest.postgresql.service.CuentaService;
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
@RequestMapping("/cafetito/cuenta")
public class CuentaController {
    
    @Autowired
    private CuentaService cuentaService;
    
    @Operation(summary = "Obtiene numero de cuenta, estado actual y estado anterior")
    @GetMapping("/estado/{noCuenta}")
    public estadoCuentaDto verificarEstadoCuenta(@PathVariable String noCuenta){
        return cuentaService.consultarEstadoCuenta(noCuenta);
    }
}
