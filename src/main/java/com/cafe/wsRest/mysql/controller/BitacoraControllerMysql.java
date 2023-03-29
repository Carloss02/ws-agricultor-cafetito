/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.BitacoraMysql;
import com.cafe.wsRest.mysql.service.BitacoraServiceMysql;
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
@RequestMapping("/bitacora")
public class BitacoraControllerMysql {
    @Autowired
    private BitacoraServiceMysql bitacoraService;
    
    @Operation(summary = "Obtiene todos los registros en bitácora.")
    @GetMapping
    public List<BitacoraMysql> getBitacoraAll(){
        return bitacoraService.getAllBitacora();
    }
    
    @Operation(summary = "Obtiene un registro en bitácora.")
    @GetMapping("/{idBitacora}")
    public Optional<BitacoraMysql> getBitacoraById(@PathVariable int idBitacora){
        
        return bitacoraService.getBitacoraById(idBitacora);
    }
    
    @Operation(summary = "Crea nuevo registro en bitácora.")
    @PostMapping
    public BitacoraMysql addBitacora(@RequestBody BitacoraMysql bitacora){
        return bitacoraService.addBitacora(bitacora);
    }
    
}
