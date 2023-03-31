/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.service;

import com.cafe.wsRest.dto.estadoCuentaDto;
import com.cafe.wsRest.postgresql.model.Cuenta;
import com.cafe.wsRest.postgresql.repository.CatalogoEstadosRepository;
import com.cafe.wsRest.postgresql.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TopVargas
 */
@Service
public class CuentaService {
 
    @Autowired
    private CuentaRepository cuentaRepository;
    
    @Autowired
    private CatalogoEstadosRepository estadosRepository; 
    
    public estadoCuentaDto consultarEstadoCuenta(String noCuenta){
        
        Cuenta cuenta = cuentaRepository.findByIdCuenta(noCuenta);
        String nombreEstado = estadosRepository.findByCodigoEstado(cuenta.getEstado()).getNombre();
        
        estadoCuentaDto respuesta = new estadoCuentaDto(
                cuenta.getIdCuenta(),
                nombreEstado
        );
        
        return respuesta;
    }
}
