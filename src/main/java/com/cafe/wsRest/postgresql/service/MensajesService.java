/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.service;

import com.cafe.wsRest.dto.MensajeCuentaConfirmadaDto;
import com.cafe.wsRest.dto.MensajeIngresoDenegadoDto;
import com.cafe.wsRest.mysql.model.MensajesMysql;
import com.cafe.wsRest.mysql.repository.CuentaCorrienteRepositoryMysql;
import com.cafe.wsRest.mysql.repository.MensajesMysqlRepositoryMysql;
import com.cafe.wsRest.postgresql.model.MensajesModel;
import com.cafe.wsRest.postgresql.repository.MensajesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class MensajesService {
    
    @Autowired
    private MensajesRepository mensajesRepository;
    
    @Autowired
    private MensajesMysqlRepositoryMysql mensajeAgricultor; 
    
    @Autowired
    private CuentaCorrienteRepositoryMysql cuentaAgricultorRepository; 
    
    public List<MensajesModel> getAllMensajes(){
        return mensajesRepository.findAll();
    }
    
    public MensajesModel enviarMensaje(MensajesModel mensaje){
        return mensajesRepository.save(mensaje);
    }
    
    public MensajeIngresoDenegadoDto enviarMensajeAgricultor(MensajeIngresoDenegadoDto msg){
        int idVenta = cuentaAgricultorRepository.findByNoCuenta(msg.getNoCuenta()).getIdVenta();
        

        MensajesMysql mensaje = new MensajesMysql();
        mensaje.setNoCuenta(msg.getNoCuenta());
        mensaje.setPlacaVehiculo(msg.getPlacaVehiculo());
        mensaje.setIdParcialidad(msg.getIdParcialidad());
        mensaje.setMensaje(msg.getMensaje());
        mensaje.setIdVenta(idVenta);
        
        MensajesMysql resultado = mensajeAgricultor.save(mensaje);
        
        msg.setIdMensaje(resultado.getIdMensaje());
        
        return msg; 
    }
    
    public MensajeCuentaConfirmadaDto enviarMensajeCuentaConfirmada(MensajeCuentaConfirmadaDto msg){
        
        int idVenta = cuentaAgricultorRepository.findByNoCuenta(msg.getNoCuenta()).getIdVenta();
        
        MensajesMysql mensaje = new MensajesMysql();
        mensaje.setNoCuenta(msg.getNoCuenta());
        mensaje.setIdParcialidad(msg.getParcialidades());
        mensaje.setMensaje(msg.getMensaje());
        mensaje.setIdVenta(idVenta);
        
        MensajesMysql resultado = mensajeAgricultor.save(mensaje);
        
        msg.setIdMensaje(resultado.getIdMensaje());
        
        return msg; 
    }
    
}
