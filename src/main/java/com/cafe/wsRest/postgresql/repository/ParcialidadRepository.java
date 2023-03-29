/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.postgresql.repository;

import com.cafe.wsRest.postgresql.model.Parcialidad;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author TopVargas
 */
public interface ParcialidadRepository extends JpaRepository<Parcialidad, Integer>{
    
}
