/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.service;

import com.cafe.wsRest.dto.siguienteParcialidadDto;
import com.cafe.wsRest.mysql.model.MensajesMysql;
import com.cafe.wsRest.mysql.repository.MensajesMysqlRepositoryMysql;
import com.cafe.wsRest.postgresql.model.Parcialidad;
import com.cafe.wsRest.postgresql.model.Pesaje;
import com.cafe.wsRest.postgresql.repository.ParcialidadRepository;
import com.cafe.wsRest.postgresql.repository.PesajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TopVargas
 */
@Service
public class PesajeService {
 
    @Autowired
    private PesajeRepository pesajeRepository;
    
    @Autowired 
    private ParcialidadService parcialidadService;
    
    @Autowired MensajesMysqlRepositoryMysql mensajesAgricultor; 
    
    public siguienteParcialidadDto addPesaje(Pesaje pesaje){
        
        pesajeRepository.save(pesaje);
        
        Parcialidad parcialidad = parcialidadService.getParcialidadById(pesaje.getIdParcialidad());
       
        MensajesMysql mensaje = new MensajesMysql();
        mensaje.setIdVenta(1);
        mensaje.setNoCuenta(parcialidad.getIdCuenta());
        mensaje.setPlacaVehiculo(parcialidad.getPlacaVehiculoAsignacion());
        mensaje.setIdParcialidad(pesaje.getIdParcialidad());
        mensaje.setMensaje("Parcialidad No. " + parcialidad.getIdParcialidad() + " recibida, favor de enviar la siguiente parcialidad");
        
        MensajesMysql respuestaMsg = mensajesAgricultor.save(mensaje);
        
        
        siguienteParcialidadDto msg = new siguienteParcialidadDto(
                respuestaMsg.getIdMensaje(),
                respuestaMsg.getNoCuenta(),
                respuestaMsg.getPlacaVehiculo(),
                respuestaMsg.getIdParcialidad(),
                respuestaMsg.getMensaje()
        );
        
        
        return msg;
    }
    
}
