/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.repository;

import com.cafe.wsRest.dto.SolicitudVehiculosDto;
import com.cafe.wsRest.mysql.model.VehiculosMysql;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author carlo
 */
public interface VehiculosRepositoryMysql extends JpaRepository<VehiculosMysql, String>{
    
    VehiculosMysql findByPlaca(String placa);
    
    /*@Query(value="select v.PLACA as placa,\n"
            + "		v.MARCA as marca,\n"
            + "		v.MODELO as modelo,\n"
            + "		v.ANIO as anio,\n"
            + "		v.COLOR as color,\n"
            + "		v.TIPO_VEHICULO as tipoVehiculo,\n"
            + "		v.PESO_ESTIMADO as capacidad,\n"
            + "         v.ESTADO as estado\n"
            + "from dbagricultor.VEHICULOS v \n"
            + "where v.PLACA in (:placas)", nativeQuery = true)
    List<VehiculosMysql> getVehiculosByIds(@Param("placas") List<String> placas);*/
}