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
@Table(name = "parcialidad", schema = "dbcafetito")
public class Parcialidad {
    
    private Integer idParcialidad;
    private String idCuenta;
    private float peso;
    private Integer estado;
    private String placaVehiculoAsignacion;
    private Date fehcaCreacion;
    private Integer usuarioCreacion;

    public Parcialidad() {
    }

    public Parcialidad(Integer idParcialidad, String idCuenta, float peso, Integer estado, String placaVehiculoAsignacion, Date fehcaCreacion, Integer usuarioCreacion) {
        this.idParcialidad = idParcialidad;
        this.idCuenta = idCuenta;
        this.peso = peso;
        this.estado = estado;
        this.placaVehiculoAsignacion = placaVehiculoAsignacion;
        this.fehcaCreacion = fehcaCreacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_parcialidad")
    public Integer getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(Integer idParcialidad) {
        this.idParcialidad = idParcialidad;
    }

    @Column(name="id_cuenta")
    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Column(name="peso")
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Column(name="estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column(name="placa_vehiculo_asignacion")
    public String getPlacaVehiculoAsignacion() {
        return placaVehiculoAsignacion;
    }

    public void setPlacaVehiculoAsignacion(String placaVehiculoAsignacion) {
        this.placaVehiculoAsignacion = placaVehiculoAsignacion;
    }

    @Column(name="fecha_creacion")
    public Date getFehcaCreacion() {
        return fehcaCreacion;
    }

    public void setFehcaCreacion(Date fehcaCreacion) {
        this.fehcaCreacion = fehcaCreacion;
    }

    @Column(name="usuario_creacion")
    public Integer getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(Integer usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }
    
    
    
}
