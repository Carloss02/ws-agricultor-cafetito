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
@Table(name = "cuenta", schema = "dbcafetito")
public class Cuenta {
    
    private String idCuenta;
    private Integer idAgricultor;
    private Integer estado;
    private Date fechaCreacion;
    private Integer usuarioCreacion;

    public Cuenta() {
    }
    
    public Cuenta(String idCuenta, Integer idAgricultor, Integer estado, Date fechaCreacion, Integer usuarioCreacion) {
        this.idCuenta = idCuenta;
        this.idAgricultor = idAgricultor;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    @Id
    @Column(name = "id_cuenta")
    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Column(name="id_agricultor")
    public Integer getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(Integer idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    @Column(name="estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column(name="fecha_creacion")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Column(name="usuario_creacion")
    public Integer getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(Integer usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }
    
    
}
