/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author TopVargas
 */
@Entity
@Table(name = "pesaje", schema = "dbcafetito")
public class Pesaje {
    
    private Integer id_pesaje;
    private Integer idParcialidad;
    private String licencia;
    private Integer estado;
    private float pesoCalculado;
    private Integer usuarioCreacion;
    private Date fechaCreacion;

    public Pesaje() {
    }

    public Pesaje(Integer id_pesaje, Integer idParcialidad, String licencia, Integer estado, float pesoCalculado, Integer usuarioCreacion, Date fechaCreacion) {
        this.id_pesaje = id_pesaje;
        this.idParcialidad = idParcialidad;
        this.licencia = licencia;
        this.estado = estado;
        this.pesoCalculado = pesoCalculado;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pesaje")
    public Integer getId_pesaje() {
        return id_pesaje;
    }

    public void setId_pesaje(Integer id_pesaje) {
        this.id_pesaje = id_pesaje;
    }

    @Column(name = "id_parcialidad")
    public Integer getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(Integer idParcialidad) {
        this.idParcialidad = idParcialidad;
    }

    @Column(name = "licencia")
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Column(name = "estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column(name = "pesaje_calculado")
    public float getPesoCalculado() {
        return pesoCalculado;
    }

    public void setPesoCalculado(float pesoCalculado) {
        this.pesoCalculado = pesoCalculado;
    }

    @Column(name = "usuario_creacion")
    public Integer getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(Integer usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Column(name = "fecha_creacion")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
    
}
