/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.dto;

import java.util.List;

/**
 *
 * @author TopVargas
 */
public class SolicitudVehiculosDto {
    
    private String placa;
    private String marca;
    private String modelo;
    private Integer anio;
    private String color;
    private String tipoVehiculo;
    private Integer capacidad;
    private String estado;
    private List<SolicitudTransportistasDto> transportistas;

    public SolicitudVehiculosDto() {
    }

    public SolicitudVehiculosDto(String placa, String marca, String modelo, Integer anio, String color, String tipoVehiculo, Integer capacidad, String estado, List<SolicitudTransportistasDto> transportistas) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.capacidad = capacidad;
        this.estado = estado;
        this.transportistas = transportistas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<SolicitudTransportistasDto> getTransportistas() {
        return transportistas;
    }

    public void setTransportistas(List<SolicitudTransportistasDto> transportistas) {
        this.transportistas = transportistas;
    }
    
    
    
}
