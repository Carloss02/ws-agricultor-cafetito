/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.TransportistaMysql;
import com.cafe.wsRest.mysql.service.TransportistaServiceMysql;
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
@RequestMapping("/transportista")
public class TransportistaControllerMysql {
    @Autowired
    private TransportistaServiceMysql transportistaService;
    
    @Operation(summary = "obtiene todos los Transportistas")
    @GetMapping
    public List<TransportistaMysql> getTransportistas(){
        return transportistaService.getTransportistas();
    }
    
    @Operation(summary = "Obtiene un Transportista")
    @GetMapping("/{noLicencia}")
    public Optional<TransportistaMysql> getTransportista(@PathVariable String noLicencia){
        return transportistaService.getTransportistaById(noLicencia);
    }
    
    @Operation(summary = "Registrar un Transportista")
    @PostMapping
    public TransportistaMysql addTransportista(@RequestBody TransportistaMysql transportista){
        return transportistaService.addTransportista(transportista);
    }
    
    @Operation(summary = "Registrar un Transportista")
    @PutMapping
    public TransportistaMysql editTransportista(@RequestBody TransportistaMysql transportista){
        return transportistaService.editTransportista(transportista);
    }
}
