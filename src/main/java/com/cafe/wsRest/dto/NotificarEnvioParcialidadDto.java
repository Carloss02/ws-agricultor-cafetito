/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.dto;

/**
 *
 * @author carlo
 */
public class NotificarEnvioParcialidadDto {
    private String numeroCuenta;
    private String placaVehiculo;
    private int parcialidad; 
    private String mensaje; 
    private char estado;

    public NotificarEnvioParcialidadDto(String numeroCuenta, String placaVehiculo, int parcialidad, String mensaje, char estado) {
        this.numeroCuenta = numeroCuenta;
        this.placaVehiculo = placaVehiculo;
        this.parcialidad = parcialidad;
        this.mensaje = mensaje;
        this.estado = estado;
    }
    
    
    
}
