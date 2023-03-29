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
@Table(name="TRANSPORTISTAS_VEHICULO"
    ,catalog="dbagricultor"
)
public class TransportistasVehiculoMysql {
    private int id;
    private int idVehiculoAsignado;
    private String noLicencia;
    private char estado;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public TransportistasVehiculoMysql() {
    }

    public TransportistasVehiculoMysql(int id, int idVehiculoAsignado, String noLicencia, char estado, String usuarioCreacion, Date fechaCreacion) {
        this.id = id;
        this.idVehiculoAsignado = idVehiculoAsignado;
        this.noLicencia = noLicencia;
        this.estado = estado;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="ID_VEHICULO_ASIGNADO")
    public int getIdVehiculoAsignado() {
        return idVehiculoAsignado;
    }

    public void setIdVehiculoAsignado(int idVehiculoAsignado) {
        this.idVehiculoAsignado = idVehiculoAsignado;
    }

    @Column(name="NO_LICENCIA")
    public String getNoLicencia() {
        return noLicencia;
    }

    public void setNoLicencia(String noLicencia) {
        this.noLicencia = noLicencia;
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
