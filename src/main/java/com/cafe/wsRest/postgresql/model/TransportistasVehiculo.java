/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.model;

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
@Table(name="transportistas_vehiculo", schema="dbcafetito")
public class TransportistasVehiculo {
    
    private Integer id;
    private String idVehiculoAsigando;
    private String licencia;
    private Integer estado;

    public TransportistasVehiculo() {
    }

    public TransportistasVehiculo(Integer id, String idVehiculoAsigando, String licencia, Integer estado) {
        this.id = id;
        this.idVehiculoAsigando = idVehiculoAsigando;
        this.licencia = licencia;
        this.estado = estado;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "id_vehiculo_asignado")
    public String getIdVehiculoAsigando() {
        return idVehiculoAsigando;
    }

    public void setIdVehiculoAsigando(String idVehiculoAsigando) {
        this.idVehiculoAsigando = idVehiculoAsigando;
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
    
    
}
