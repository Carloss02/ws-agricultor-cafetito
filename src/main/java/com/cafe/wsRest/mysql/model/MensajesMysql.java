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
import lombok.Builder;

/**
 *
 * @author carlo
 */
@Builder
@Entity
@Table(name="MENSAJES"
    ,catalog="dbagricultor"
)
public class MensajesMysql {
    private int idMensaje;
    private int idVenta;
    private int idAgricultor;
    private String noCuenta;
    private String placaVehiculo;
    private int idParcialidad;
    private int peso;
    private String Mensaje;
    private char estado;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public MensajesMysql() {
    }

    public MensajesMysql(int idMensaje, int idVenta, int idAgricultor, String noCuenta, String placaVehiculo, int idParcialidad, int peso, String Mensaje, char estado, String usuarioCreacion, Date fechaCreacion) {
        this.idMensaje = idMensaje;
        this.idVenta = idVenta;
        this.idAgricultor = idAgricultor;
        this.noCuenta = noCuenta;
        this.placaVehiculo = placaVehiculo;
        this.idParcialidad = idParcialidad;
        this.peso = peso;
        this.Mensaje = Mensaje;
        this.estado = estado;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_MENSAJE")
    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    @Column(name="ID_VENTA")
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Column(name="ID_AGRICULTOR")
    public int getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(int idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    @Column(name="NO_CUENTA")
    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    @Column(name="PLACA_VEHICULO")
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    @Column(name="ID_PARCIALIDAD")
    public int getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(int idParcialidad) {
        this.idParcialidad = idParcialidad;
    }

    @Column(name="PESO")
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Column(name="MENSAJE")
    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
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
