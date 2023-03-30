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
public class CuentaCorrienteDto {
    
    private Integer idVenta;
    private Integer idAgricultor;
    private float pesoTotalCafe;
    private Integer cantidadParcialidades;
    private List<CuentaVehiculosDto> vehiculos;

    public CuentaCorrienteDto() {
    }

    public CuentaCorrienteDto(Integer idVenta, Integer idAgricultor, float pesoTotalCafe, Integer cantidadParcialidades, List<CuentaVehiculosDto> vehiculos) {
        this.idVenta = idVenta;
        this.idAgricultor = idAgricultor;
        this.pesoTotalCafe = pesoTotalCafe;
        this.cantidadParcialidades = cantidadParcialidades;
        this.vehiculos = vehiculos;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(Integer idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public float getPesoTotalCafe() {
        return pesoTotalCafe;
    }

    public void setPesoTotalCafe(float pesoTotalCafe) {
        this.pesoTotalCafe = pesoTotalCafe;
    }

    public Integer getCantidadParcialidades() {
        return cantidadParcialidades;
    }

    public void setCantidadParcialidades(Integer cantidadParcialidades) {
        this.cantidadParcialidades = cantidadParcialidades;
    }

    public List<CuentaVehiculosDto> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<CuentaVehiculosDto> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
}
