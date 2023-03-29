/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.ParcialidadesMysql;
import com.cafe.wsRest.mysql.repository.ParcialidadesRepositoryMysql;
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
    
    public Optional<ParcialidadesMysql> getParcialidadById(int idParcialidad){
        return parcialidadesRepository.findById(idParcialidad);
    }
    
    public List<ParcialidadesMysql> getParcialidades(){
        return parcialidadesRepository.findAll();
    }
    
    public ParcialidadesMysql addParcialidad(ParcialidadesMysql parcialidad){
        return parcialidadesRepository.save(parcialidad);
    }
    
    public ParcialidadesMysql editParcialidad(ParcialidadesMysql parcialidad){
        return parcialidadesRepository.save(parcialidad);
    }
}
