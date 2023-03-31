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
public class MensajeCuentaConfirmadaDto {
    private int idMensaje;
    private String noCuenta; 
    private int parcialidades; 
    private int totalPesaje; 
    private String mensaje; 

    public MensajeCuentaConfirmadaDto() {
    }

    public MensajeCuentaConfirmadaDto(int idMensaje, String noCuenta, int idParcialidad, int totalPesaje, String mensaje) {
        this.idMensaje = idMensaje;
        this.noCuenta = noCuenta;
        this.parcialidades = idParcialidad;
        this.totalPesaje = totalPesaje;
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

    public int getParcialidades() {
        return parcialidades;
    }

    public void setParcialidades(int parcialidades) {
        this.parcialidades = parcialidades;
    }

    public int getTotalPesaje() {
        return totalPesaje;
    }

    public void setTotalPesaje(int totalPesaje) {
        this.totalPesaje = totalPesaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
