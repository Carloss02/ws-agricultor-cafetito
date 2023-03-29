/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author carlo
 */
@Entity
@Table(name="CUENTA_VEHICULOS"
    ,catalog="dbagricultor"
)
public class CuentaVehiculosMysql {
    private int idVehiculoAsignado;
    private String placaVehiculoAsignado;
    private int idVenta;
    private char estado;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public CuentaVehiculosMysql() {
    }

    public CuentaVehiculosMysql(int idVehiculoAsignado, String placaVehiculoAsignado, int idVenta, char estado, String usuarioCreacion, Date fechaCreacion) {
        this.idVehiculoAsignado = idVehiculoAsignado;
        this.placaVehiculoAsignado = placaVehiculoAsignado;
        this.idVenta = idVenta;
        this.estado = estado;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_VEHICULO_ASIGNADO")
    public int getIdVehiculoAsignado() {
        return idVehiculoAsignado;
    }

    public void setIdVehiculoAsignado(int idVehiculoAsignado) {
        this.idVehiculoAsignado = idVehiculoAsignado;
    }

    @Column(name="PLACA_VEHICULO_ASIGNADO")
    public String getPlacaVehiculoAsignado() {
        return placaVehiculoAsignado;
    }

    public void setPlacaVehiculoAsignado(String placaVehiculoAsignado) {
        this.placaVehiculoAsignado = placaVehiculoAsignado;
    }

    @Column(name="ID_VENTA")
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Column(name="ESTADO")
    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Column(name="USUARIO_CREACION")
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Column(name="FECHA_CREACION")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
    
}
