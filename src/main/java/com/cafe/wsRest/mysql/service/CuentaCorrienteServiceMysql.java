/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.service;

import com.cafe.wsRest.mysql.model.CuentaCorrienteMysql;
import com.cafe.wsRest.mysql.repository.CuentaCorrienteRepositoryMysql;
import java.util.List;
import java.util.Optional;
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
}
