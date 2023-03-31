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
public class estadoCuentaDto {
    private String noCuenta; 
    private String estadoActual;

    public estadoCuentaDto() {
    }

    public estadoCuentaDto(String noCuenta, String estadoActual) {
        this.noCuenta = noCuenta;
        this.estadoActual = estadoActual;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }
    
    
}
