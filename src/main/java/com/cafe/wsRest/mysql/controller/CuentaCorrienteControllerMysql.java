/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.CuentaCorrienteMysql;
import com.cafe.wsRest.mysql.service.CuentaCorrienteServiceMysql;
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
@RequestMapping("/cuenta")
public class CuentaCorrienteControllerMysql {
    @Autowired
    private CuentaCorrienteServiceMysql cuentaService;
    
    @Operation(summary = "obtiene todos las cuentas")
    @GetMapping
    public List<CuentaCorrienteMysql> getCuentas(){
        return cuentaService.getCuentas();
    }
    
    @Operation(summary = "Obtiene una cuenta")
    @GetMapping("/{idVenta}")
    public Optional<CuentaCorrienteMysql> getCuenta(@PathVariable int idVenta){
        return cuentaService.getCuentaById(idVenta);
    }
    
    @Operation(summary = "Registrar una cuenta")
    @PostMapping
    public CuentaCorrienteMysql addCuenta(@RequestBody CuentaCorrienteMysql cuenta){
        return cuentaService.addCuenta(cuenta);
    }
    
    @Operation(summary = "Edita una Cuenta")
    @PutMapping
    public CuentaCorrienteMysql editCuenta(@RequestBody CuentaCorrienteMysql cuenta){
        return cuentaService.editCuenta(cuenta);
    }
}
