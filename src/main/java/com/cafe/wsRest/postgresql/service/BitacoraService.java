/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.service;

import com.cafe.wsRest.postgresql.model.Bitacora;
import com.cafe.wsRest.postgresql.repository.BitacoraRepository;
import com.google.gson.Gson;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TopVargas
 */
@Service
public class BitacoraService {
    
    @Autowired
    private BitacoraRepository bitacoraRepository;
    
    public void addRecord(String tableName, String id, char typeOperation, Object data, Integer usuario){
        
        bitacoraRepository.save(
                Bitacora.builder()
                .nombreTabla(tableName)
                .idRegistro(id)
                .tipoOperacion(typeOperation)
                .datos(new Gson().toJson(data))
                .fechaModificacion(new Date())
                .usuarioModificacion(usuario)
                .build()
        );
    }
}
