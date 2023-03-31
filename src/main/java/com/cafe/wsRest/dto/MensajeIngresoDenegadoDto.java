/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.dto;

/**
 *
 * @author carlos
 */
public class MensajeIngresoDenegadoDto {
    private int idMensaje;
    private String noCuenta;
    private String placaVehiculo; 
    private int idParcialidad;
    private String mensaje; 

    public MensajeIngresoDenegadoDto() {
    }

    public MensajeIngresoDenegadoDto(int idMensaje, String noCuenta, String placaVehiculo, int idParcialidad, String mensaje) {
        this.idMensaje = idMensaje;
        this.noCuenta = noCuenta;
        this.placaVehiculo = placaVehiculo;
        this.idParcialidad = idParcialidad;
        this.mensaje = mensaje;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public int getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(int idParcialidad) {
        this.idParcialidad = idParcialidad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
