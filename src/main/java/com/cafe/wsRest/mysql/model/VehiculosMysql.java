/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author carlo
 */
@Entity
@Table(name="VEHICULOS"
    ,catalog="dbagricultor"
)
public class VehiculosMysql {
    private String placa;
    private String marca;
    private String modelo;
    private String anio;
    private int pesoEstimado;
    private String color;
    private String tipoVehiculo;
    private int estado;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public VehiculosMysql() {
    }

    public VehiculosMysql(String placa, String marca, String modelo, String anio, int pesoEstimado, String color, String tipoVehiculo, int estado, String usuarioCreacion, Date fechaCreacion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.pesoEstimado = pesoEstimado;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.estado = estado;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id 
    @Column(name="PLACA")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Column(name="MARCA")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Column(name="MODELO")
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Column(name="ANIO")
    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Column(name="PESO_ESTIMADO")
    public int getPesoEstimado() {
        return pesoEstimado;
    }

    public void setPesoEstimado(int pesoEstimado) {
        this.pesoEstimado = pesoEstimado;
    }

    @Column(name="COLOR")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name="TIPO_VEHICULO")
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Column(name="ESTADO")
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
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
