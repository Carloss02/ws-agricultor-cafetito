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
@Table(name="PARCIALIDADES"
    ,catalog="dbagricultor"
)
public class ParcialidadesMysql {
    private int idParcialidad;
    private int idVenta;
    private int peso;
    private int estado;
    private int idVehiculoAsignado;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public ParcialidadesMysql() {
    }

    public ParcialidadesMysql(int idParcialidad, int idVenta, int peso, int estado, int idVehiculoAsignado, String usuarioCreacion, Date fechaCreacion) {
        this.idParcialidad = idParcialidad;
        this.idVenta = idVenta;
        this.peso = peso;
        this.estado = estado;
        this.idVehiculoAsignado = idVehiculoAsignado;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_PARCIALIDAD")
    public int getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(int idParcialidad) {
        this.idParcialidad = idParcialidad;
    }

    @Column(name="ID_VENTA")
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Column(name="PESO")
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Column(name="ESTADO")
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Column(name="ID_VEHICULO_ASIGNADO")
    public int getIdVehiculoAsignado() {
        return idVehiculoAsignado;
    }

    public void setIdVehiculoAsignado(int idVehiculoAsignado) {
        this.idVehiculoAsignado = idVehiculoAsignado;
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
