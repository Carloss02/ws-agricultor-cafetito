/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author carlo
 */
@Entity
@Table(name = "mensajes", schema = "dbcafetito")
public class MensajesModel implements Serializable {
    
    private int idMensaje;
    private int idAgricultor;   
    private String idCuenta; 
    private String placaVehiculo;  
    private int idParcialidad;  
    private String mensaje;   
    private String estadoMensaje;   
    private Date fechaCreacion;
    private String usuarioCreacion;
    public MensajesModel() {
    }

    public MensajesModel(int idMensaje, int idAgricultor, String idCuenta, String placaVehiculo, int idParcialidad, String mensaje, String estadoMensaje, Date fechaCreacion, String usuarioCreacion) {
        this.idMensaje = idMensaje;
        this.idAgricultor = idAgricultor;
        this.idCuenta = idCuenta;
        this.placaVehiculo = placaVehiculo;
        this.idParcialidad = idParcialidad;
        this.mensaje = mensaje;
        this.estadoMensaje = estadoMensaje;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensaje")
    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    @Column(name = "id_agricultor")
    public int getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(int idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    @Column(name = "id_cuenta")
    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Column(name = "placa_vehiculo")
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    @Column(name = "idParcialidad")
    public int getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(int idParcialidad) {
        this.idParcialidad = idParcialidad;
    }

    @Column(name = "mensaje")
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Column(name = "estado_mensaje")
    public String getEstadoMensaje() {
        return estadoMensaje;
    }

    public void setEstadoMensaje(String estadoMensaje) {
        this.estadoMensaje = estadoMensaje;
    }

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Column(name = "usuario_creacion")
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }
    
    
}
