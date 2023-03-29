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
import lombok.Builder;

/**
 *
 * @author TopVargas
 */
@Builder
@Entity
@Table(name = "bitacora", schema = "dbcafetito")
public class Bitacora {
 
    private Integer id;
    private String nombreTabla;
    private String idRegistro;
    private char tipoOperacion;
    private String datos;
    private Date fechaModificacion;
    private Integer usuarioModificacion;

    public Bitacora() {
    }

    public Bitacora(Integer id, String nombreTabla, String idRegistro, char tipoOperacion, String datos, Date fechaModificacion, Integer usuarioModificacion) {
        this.id = id;
        this.nombreTabla = nombreTabla;
        this.idRegistro = idRegistro;
        this.tipoOperacion = tipoOperacion;
        this.datos = datos;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
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

    @Column(name="nombre_tabla")
    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    @Column(name="id_registro")
    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    @Column(name="tipo_operacion")
    public char getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(char tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    @Column(name="datos")
    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    @Column(name="fecha_modifica")
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Column(name="usuario_modifica")
    public Integer getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(Integer usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }
    
    
}
