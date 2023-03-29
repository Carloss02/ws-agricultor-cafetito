/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.MensajesMysql;
import com.cafe.wsRest.mysql.service.MensajesServiceMysql;
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
 * @author carlos
 */
@RestController
@RequestMapping("/mensajes")
public class MensajesControllerMysql {
    @Autowired
    private MensajesServiceMysql mensajesService;
    
    @Operation(summary = "obtiene todos los mensajes")
    @GetMapping
    public List<MensajesMysql> getMensajes(){
        return mensajesService.getMensajes();
    }
    
    @Operation(summary = "Obtiene un mensaje")
    @GetMapping("/{idMensaje}")
    public Optional<MensajesMysql> getMensaje(@PathVariable int idMensaje){
        return mensajesService.getMensajeById(idMensaje);
    }
    
    @Operation(summary = "Registrar un mensaje")
    @PostMapping
    public MensajesMysql addMensaje(@RequestBody MensajesMysql mensaje){
        return mensajesService.addMensaje(mensaje);
    }
    
    @Operation(summary = "Editar un mensaje")
    @PutMapping
    public MensajesMysql editMensaje(@RequestBody MensajesMysql mensaje){
        return mensajesService.editMensaje(mensaje);
    }
}
