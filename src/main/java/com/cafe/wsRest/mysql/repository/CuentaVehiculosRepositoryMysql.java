/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.repository;

import com.cafe.wsRest.mysql.model.CuentaVehiculosMysql;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carlo
 */
public interface CuentaVehiculosRepositoryMysql extends JpaRepository<CuentaVehiculosMysql, Integer>{
    
    List<CuentaVehiculosMysql> findByIdVenta(Integer idVenta);
}
