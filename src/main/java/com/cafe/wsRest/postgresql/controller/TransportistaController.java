/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.controller;

import com.cafe.wsRest.postgresql.model.Transportista;
import com.cafe.wsRest.postgresql.service.TransportistaService;
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
@RequestMapping("/cafetito/transportista")
public class TransportistaController {
    
    @Autowired
    private TransportistaService transportistaService;
    
    @Operation(summary = "obtener todos los mensajes en el sistema del beneficio de café")
    @GetMapping("/{estado}")
    public List<Transportista> getCarrierByLicenseAndStatus(
            @PathVariable Integer estado){
        
        return transportistaService.getCarrierByStatus(estado);        
    }
    
    @Operation(summary = "agrega un nuevo transportista al sistema del beneficio de cafe")
    @PostMapping("/add")
    public Transportista addCarrier(
            @RequestBody Transportista t){
        return transportistaService.addCarrier(t);
    }
}
