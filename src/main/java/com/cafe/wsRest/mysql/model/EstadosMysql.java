/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author carlo
 */
@Entity
@Table(name="ESTADOS"
    ,catalog="dbagricultor"
)
public class EstadosMysql implements java.io.Serializable{
    private int codigoEstado;
    private String nombre; 
    private String descripcion;
    private char estado; 

    public EstadosMysql() {
    }

    public EstadosMysql(int codigoEstado, String nombre, String descripcion, char estado) {
        this.codigoEstado = codigoEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CODIGO_ESTADO")
    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    @Column(name="NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name="ESTADO")
    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    
}
