/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.mysql.model.MensajesMysqlModel;
import com.cafe.wsRest.mysql.service.MensajesMysqlService;
import com.cafe.wsRest.postgresql.model.MensajesModel;
import com.cafe.wsRest.postgresql.service.MensajesService;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlo
 */
@RestController
@RequestMapping("/agricultor/mensajes")
public class MensajesMysqlController {
    @Autowired
    private MensajesMysqlService mensajesMysqlService; 
    
    @Autowired
    private MensajesService mensajesService; 
    
    @Operation(summary = "obtener todos los mensajes en el sistema del agricultor")
    @GetMapping("/all")
    public List<MensajesMysqlModel> getAllMensajes(){
        return mensajesMysqlService.getAllMensajes();
    }
    
    @Operation(summary = "enviar mensaje al sistema de beneficio de café.")
    @PostMapping("/enviar")
    public MensajesModel enviarMensaje(@RequestBody MensajesModel mensaje){
        return mensajesService.enviarMensaje(mensaje);
    }
}
