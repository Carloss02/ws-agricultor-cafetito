/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.BitacoraMysql;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cafe.wsRest.mysql.repository.BitacoraRepositoryMysql;
import com.google.gson.Gson;
import java.util.Date;

/**
 *
 * @author carlo
 */
@Service
public class BitacoraServiceMysql {
    @Autowired
    private BitacoraRepositoryMysql bitacoraRepository;
    
    public List<BitacoraMysql> getAllBitacora(){
        return bitacoraRepository.findAll();
    }
    
    public Optional<BitacoraMysql> getBitacoraById(int idBitacora) {
        return bitacoraRepository.findById(idBitacora);
    }
    
    public BitacoraMysql addBitacora(BitacoraMysql bitacora){
        return bitacoraRepository.save(bitacora);
    }
    
    public void addRecord(String tableName, String id, char typeOperation, Object data, Integer usuario){
        
        bitacoraRepository.save(
                BitacoraMysql.builder()
                .nombreTabla(tableName)
                .idRegistro(id)
                .tipoOperacion(typeOperation)
                .datos(new Gson().toJson(data))
                .fechaCreacion(new Date())
                .usuarioCreacion("WEB SERVICE")
                .build()
        );
    }
    
}
