/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.controller;

import com.cafe.wsRest.dto.MensajeCuentaConfirmadaDto;
import com.cafe.wsRest.dto.MensajeIngresoDenegadoDto;
import com.cafe.wsRest.mysql.model.MensajesMysql;
import com.cafe.wsRest.mysql.service.MensajesServiceMysql;
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
@RequestMapping("/cafetito/mensajes")
public class MensajesController {
    
    @Autowired
    private MensajesService mensajeService; 
    
    @Operation(summary = "obtener todos los mensajes en el sistema del beneficio de café")
    @GetMapping("/all")
    public List<MensajesModel> getAllMensajes(){
        return mensajeService.getAllMensajes();
    }
    
    @Operation(summary = "Notificar ingreso denegado")
    @PostMapping("/enviar")
    public MensajeIngresoDenegadoDto notificarIngresoDenegado(@RequestBody MensajeIngresoDenegadoDto mensaje){
        return mensajeService.enviarMensajeAgricultor(mensaje);
    }
    
    @Operation(summary = "obtener todos los mensajes en el sistema del beneficio de café")
    @PostMapping("/msgCuentaConfirmada")
    public MensajeCuentaConfirmadaDto mensajeConfirmarCuenta(@RequestBody MensajeCuentaConfirmadaDto mensaje){
        return mensajeService.enviarMensajeCuentaConfirmada(mensaje);
    }
    
}
