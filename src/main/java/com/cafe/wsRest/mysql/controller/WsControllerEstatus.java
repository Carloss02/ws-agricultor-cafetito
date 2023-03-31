/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.controller;

import com.cafe.wsRest.dto.WsActiveDto;
import io.swagger.v3.oas.annotations.Operation;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlos
 */
@RestController
@RequestMapping("/isWebServiceActive")
public class WsControllerEstatus {
    @Operation(summary = "Método de prueba, para verificar que el servicio web esté activo. ")
    @GetMapping
    public WsActiveDto isWebServiceActive(){
        WsActiveDto respuesta = new WsActiveDto(
                "Web Service Running",
                true,
                new Date()
            );
        return respuesta;
    }
}
