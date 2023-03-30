/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.projection;

import java.util.Date;

/**
 *
 * @author TopVargas
 */
public interface SolicitudTransportistasProjection {
    
    String getLicencia();
    String getTipoLicencia();
    String getNombre();
    Date getFechaNacimiento();
    String getTelefono();
    String getEmail();
    String getEstado();
    String getPlaca();
    
}
