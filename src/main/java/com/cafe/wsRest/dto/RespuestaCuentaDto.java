/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.dto;

/**
 *
 * @author TopVargas
 */
public class RespuestaCuentaDto {
    
    private Integer idVenta;
    private String numeroCuenta;
    private Boolean aprobado;
    private Boolean correcion;
    private String mensaje;

    public RespuestaCuentaDto() {
    }

    public RespuestaCuentaDto(Integer idVenta, String numeroCuenta, Boolean aprobado, Boolean correcion, String mensaje) {
        this.idVenta = idVenta;
        this.numeroCuenta = numeroCuenta;
        this.aprobado = aprobado;
        this.correcion = correcion;
        this.mensaje = mensaje;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Boolean getCorrecion() {
        return correcion;
    }

    public void setCorrecion(Boolean correcion) {
        this.correcion = correcion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    
}
