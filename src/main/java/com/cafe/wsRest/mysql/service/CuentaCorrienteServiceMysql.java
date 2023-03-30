/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.dto.CuentaCorrienteDto;
import com.cafe.wsRest.dto.CuentaVehiculosDto;
import com.cafe.wsRest.dto.RespuestaCuentaDto;
import com.cafe.wsRest.dto.SolicitudDto;
import com.cafe.wsRest.dto.SolicitudTransportistasDto;
import com.cafe.wsRest.dto.SolicitudVehiculosDto;
import com.cafe.wsRest.mysql.model.CuentaCorrienteMysql;
import com.cafe.wsRest.mysql.model.CuentaVehiculosMysql;
import com.cafe.wsRest.mysql.model.MensajesMysql;
import com.cafe.wsRest.mysql.model.TransportistasVehiculoMysql;
import com.cafe.wsRest.mysql.model.VehiculosMysql;
import com.cafe.wsRest.mysql.repository.CuentaCorrienteRepositoryMysql;
import com.cafe.wsRest.mysql.repository.CuentaVehiculosRepositoryMysql;
import com.cafe.wsRest.mysql.repository.MensajesMysqlRepositoryMysql;
import com.cafe.wsRest.mysql.repository.TransportistaRepositoryMysql;
import com.cafe.wsRest.mysql.repository.TransportistasVehiculoRepositoryMysql;
import com.cafe.wsRest.mysql.repository.VehiculosRepositoryMysql;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class CuentaCorrienteServiceMysql {
    @Autowired
    private CuentaCorrienteRepositoryMysql cuentaRepository;
    
    @Autowired
    private TransportistasVehiculoRepositoryMysql transportistasVehiculosRepositoryMysql;
    
    @Autowired
    private CuentaVehiculosRepositoryMysql cuentaVehiculoRepositoryMysql;
    
    @Autowired
    private VehiculosRepositoryMysql vehiculosRepositoryMsql;
    
    @Autowired
    private TransportistaRepositoryMysql transportistaRepositoryMsql;
    
    @Autowired
    private MensajesMysqlRepositoryMysql mensajeMyqlRepository;
    
    @Autowired
    private BitacoraServiceMysql bitacoraServiceMysql;
    

    public Optional<CuentaCorrienteMysql> getCuentaById(int idVenta){
        return cuentaRepository.findById(idVenta);
    }
    
    public List<CuentaCorrienteMysql> getCuentas(){
        return cuentaRepository.findAll();
    }
    
    public CuentaCorrienteMysql addCuenta(CuentaCorrienteMysql cuenta){
        return cuentaRepository.save(cuenta);
    }
    
    public CuentaCorrienteMysql editCuenta(CuentaCorrienteMysql cuenta){
        return cuentaRepository.save(cuenta);
    }
    
    public List<CuentaCorrienteMysql> cuenta(Integer estado){
        return cuentaRepository.findByEstado(estado);
    }
    
    public List<CuentaCorrienteDto> getCuentasByStatus(Integer estado){
        
        List<CuentaCorrienteMysql> cuenta = cuentaRepository.findByEstado(estado);
        List<CuentaVehiculosDto> listV = new ArrayList<>();
        
        List<CuentaCorrienteDto> lista = cuenta
                .stream()
                .map(c
                        -> new CuentaCorrienteDto(c.getIdventa(), c.getIdAgricultor(), 0, 0, cuentaVehiculoRepositoryMysql.findByIdVenta(c.getIdventa())
                        .stream()
                        .map(v
                                -> new CuentaVehiculosDto(v.getPlacaVehiculoAsignado(), transportistasVehiculosRepositoryMysql.findByIdVehiculoAsignado(v.getIdVehiculoAsignado())
                                .stream()
                                .map(tv -> tv.getNoLicencia()
                                ).collect(Collectors.toList()))
                        ).collect(Collectors.toList())
                )
                ).collect(Collectors.toList());

        return lista;
        /*List<CuentaCorrienteDto> lista = new ArrayList<>();
        List<CuentaVehiculosDto> listV = new ArrayList<>();
        
        List<CuentaCorrienteMysql> cuenta = cuentaRepository.findByEstado(estado);
        if(!cuenta.isEmpty()){
            System.out.println("QUE TRAE LA EL REPOSITORIO CUENTA: " + new Gson().toJson(cuenta));
            cuenta.forEach(c ->{
                CuentaCorrienteDto dto = new CuentaCorrienteDto();
                dto.setIdVenta(c.getIdventa());
                dto.setIdAgricultor(c.getIdAgricultor());
                
                //System.out.println("QUE TRAE LA CUENTA: " + new Gson().toJson(c));
                List<CuentaVehiculosMysql> vehiculos = cuentaVehiculoRepositoryMysql.findByIdVenta(c.getIdventa());
                System.out.println("QUE TRAE LA EL REPOSITORIO VEHICULOS: " + new Gson().toJson(vehiculos));
                if(!vehiculos.isEmpty()){
                    vehiculos.forEach(v ->{
                       // System.out.println("QUE TRAE EL VEHICULO:"+ new Gson().toJson(v));
                        CuentaVehiculosDto dtoV = new CuentaVehiculosDto();
                        List<String> listT =  transportistasVehiculosRepositoryMysql.findByIdVehiculoAsignado(v.getIdVehiculoAsignado())
                                                                                    .stream() // Convertir el resultado a un stream
                                                                                    .map(tv -> tv.getNoLicencia()) // Obtener el valor de noLicencia de cada objeto
                                                                                    .collect(Collectors.toList());
                        System.out.println("QUE TRAE LA EL REPOSITORIO Transportistas: " + new Gson().toJson(listT));
                        dtoV.setPlaca(v.getPlacaVehiculoAsignado());
                        dtoV.setLicencias(listT);
                       // System.out.println("EL OBJETO DTOV: "+ new Gson().toJson(dtoV));
                        listV.add(dtoV);
                        
                    });
                }
                dto.setVehiculos(listV);
               // System.out.println("EL OBJETO DTO: "+ new Gson().toJson(dto));
                lista.add(dto);
            });
        }
        return lista;*/
    }
    
    public List<SolicitudDto> getAllCuentaDetailssByStatus(Integer Status){
        
        List<CuentaCorrienteDto> cuentas = this.getCuentasByStatus(Status);

        List<SolicitudDto> lists = cuentas
                .stream()
                .map(c ->
                        new SolicitudDto(c.getIdVenta(), c.getIdAgricultor(), c.getPesoTotalCafe(), c.getCantidadParcialidades(), vehiculosRepositoryMsql.findAllById(c.getVehiculos()
                                .stream()
                                .map(z ->
                                        z.getPlaca()
                                ).collect(Collectors.toList())
                        ).stream()
                                .map(v ->
                                        new SolicitudVehiculosDto(v.getPlaca(), v.getMarca(),v.getModelo(), Integer.parseInt(v.getAnio()), v.getColor(), v.getTipoVehiculo(), v.getPesoEstimado(), "Autorizado", 
                                                transportistaRepositoryMsql.getTransportistasByIdventaAndPlaca(c.getIdVenta(), v.getPlaca())
                                                        .stream()
                                                        .map(t -> 
                                                                new SolicitudTransportistasDto(t.getLicencia(), t.getTipoLicencia(), t.getNombre(), new Date(),t.getTelefono(), t.getEmail(), t.getEstado())
                                                        ).collect(Collectors.toList()))                
                                ).collect(Collectors.toList())
                        )
                ).collect(Collectors.toList());
        
        return lists;
    }
    
    public RespuestaCuentaDto transactionsCuenta(RespuestaCuentaDto dto){
     CuentaCorrienteMysql cuenta = cuentaRepository.findById(dto.getIdVenta()).get();
     if(dto.getAprobado()){
         cuenta.setNoCuenta(dto.getNumeroCuenta());
         cuenta.setEstado(7);
     }else if(dto.getCorrecion()){
         cuenta.setNoCuenta(null);
         cuenta.setEstado(21);
     }else if(!dto.getAprobado() && !dto.getCorrecion()){
         cuenta.setNoCuenta(null);
         cuenta.setEstado(20);
     }
     cuentaRepository.save(cuenta);

     bitacoraServiceMysql.addRecord("CUENTA_CORRIENTE", String.valueOf(cuenta.getIdventa()), 'U', cuenta, 3);
     
     MensajesMysql msg = mensajeMyqlRepository.save(
             MensajesMysql.builder()
             .Mensaje(dto.getMensaje())
             .estado('A')
             .fechaCreacion(new Date())
             .idAgricultor(cuenta.getIdAgricultor())
             .idVenta(dto.getIdVenta())
             .noCuenta(cuenta.getNoCuenta())
             .usuarioCreacion("WEB SERVICE")
             .build()
     );   
     
     bitacoraServiceMysql.addRecord("MENSAJES", String.valueOf(msg.getIdMensaje()), 'I', msg, 3);
     
        return dto;
    }
}
