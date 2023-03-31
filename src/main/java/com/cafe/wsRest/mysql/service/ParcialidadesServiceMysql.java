/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.dto.VehiculoEnRutaDto;
import com.cafe.wsRest.mysql.model.CuentaCorrienteMysql;
import com.cafe.wsRest.mysql.model.EstadosMysql;
import com.cafe.wsRest.mysql.model.ParcialidadesMysql;
import com.cafe.wsRest.mysql.model.VehiculosMysql;
import com.cafe.wsRest.mysql.repository.ParcialidadesRepositoryMysql;
import com.cafe.wsRest.postgresql.model.MensajesModel;
import com.cafe.wsRest.postgresql.service.MensajesService;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class ParcialidadesServiceMysql {
    @Autowired
    private ParcialidadesRepositoryMysql parcialidadesRepository;
    
    @Autowired
    private CuentaCorrienteServiceMysql cuentaService;
    
    @Autowired
    private MensajesService mensajeService;
    
    @Autowired
    private EstadosServiceMysql estadoService;
    
    @Autowired VehiculosServiceMysql vehiculosService;
    
    public Optional<ParcialidadesMysql> getParcialidadById(int idParcialidad){
        return parcialidadesRepository.findById(idParcialidad);
    }
    
    public List<ParcialidadesMysql> getParcialidadByIdVenta(Integer idVenta){
        return parcialidadesRepository.findByIdVenta(idVenta);
    }
    
    public VehiculoEnRutaDto getParcialidadEnRutaByPlaca(String placa){
        ParcialidadesMysql parcialidad = parcialidadesRepository.findByPlacaVehiculoAsignadoAndEstado(placa, 17);
        
        CuentaCorrienteMysql cuenta = cuentaService.getCuentaById(parcialidad.getIdVenta());
        
        
        VehiculosMysql vehiculo = vehiculosService.getVehiculoById(placa);
        
        EstadosMysql estado = estadoService.getEstadosById(17);       
        
        VehiculoEnRutaDto respuesta = new VehiculoEnRutaDto(
                placa,
                vehiculo.getMarca(),
                vehiculo.getModelo(),
                vehiculo.getAnio(),
                vehiculo.getColor(),
                vehiculo.getTipoVehiculo(),
                estado.getNombre(),
                cuenta.getNoCuenta(),
                parcialidad.getIdParcialidad()
        );
        
        return respuesta;
    }
    
    public List<ParcialidadesMysql> getParcialidades(){
        return parcialidadesRepository.findAll();
    }
    
    public ParcialidadesMysql addParcialidad(ParcialidadesMysql parcialidad){
        
        ParcialidadesMysql resultado = parcialidadesRepository.save(parcialidad);
        
        CuentaCorrienteMysql cuenta = cuentaService.getCuentaById(parcialidad.getIdVenta());
        
        MensajesModel mensajeACafetito = new MensajesModel();
        mensajeACafetito.setIdCuenta(cuenta.getNoCuenta());
        mensajeACafetito.setIdAgricultor(cuenta.getIdAgricultor());
        mensajeACafetito.setPlacaVehiculo(resultado.getPlacaVehiculoAsignado());
        mensajeACafetito.setIdParcialidad(resultado.getIdParcialidad());
        mensajeACafetito.setMensaje("Parcialidad No. " + resultado.getIdParcialidad() + " ha sido enviada.");
        mensajeACafetito.setEstadoMensaje("Activo");
        mensajeACafetito.setPeso(resultado.getPeso());
        mensajeACafetito.setFechaCreacion(new Date());
        mensajeACafetito.setUsuarioCreacion(resultado.getUsuarioCreacion());
        
        
        mensajeService.enviarMensaje(mensajeACafetito);
        return parcialidad;
    }
    
    public ParcialidadesMysql editParcialidad(ParcialidadesMysql parcialidad){
        return parcialidadesRepository.save(parcialidad);
    }
    
    
    public MensajesModel sendParcialidad(ParcialidadesMysql parcialidad){
        
        ParcialidadesMysql resultado = parcialidadesRepository.save(parcialidad);
        
        CuentaCorrienteMysql cuenta = cuentaService.getCuentaById(parcialidad.getIdVenta());
        
        MensajesModel mensajeACafetito = new MensajesModel();
        mensajeACafetito.setIdCuenta(cuenta.getNoCuenta());
        mensajeACafetito.setIdAgricultor(cuenta.getIdAgricultor());
        mensajeACafetito.setPlacaVehiculo(resultado.getPlacaVehiculoAsignado());
        mensajeACafetito.setIdParcialidad(resultado.getIdParcialidad());
        mensajeACafetito.setMensaje("Parcialidad No. " + resultado.getIdParcialidad() + " ha sido enviada.");
        mensajeACafetito.setEstadoMensaje("Activo");
        mensajeACafetito.setPeso(resultado.getPeso());
        mensajeACafetito.setFechaCreacion(new Date());
        mensajeACafetito.setUsuarioCreacion(resultado.getUsuarioCreacion());
        
        
        mensajeService.enviarMensaje(mensajeACafetito);
        return mensajeACafetito;
    }
}
