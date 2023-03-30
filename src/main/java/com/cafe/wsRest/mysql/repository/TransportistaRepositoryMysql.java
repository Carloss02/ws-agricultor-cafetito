/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.mysql.repository;

import com.cafe.wsRest.dto.SolicitudTransportistasDto;
import com.cafe.wsRest.mysql.model.TransportistaMysql;
import com.cafe.wsRest.projection.SolicitudTransportistasProjection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author carlo
 */
public interface TransportistaRepositoryMysql extends JpaRepository<TransportistaMysql, String>{
    
   @Query(value="select\n"
            + "	t.NO_LICENCIA as licencia,\n"
            + "	t.TIPO_LICENCIA as tipoLicencia,\n"
            + "	t.NOMBRE as nombre,\n"
            + "	t.TELEFONO as telefono,\n"
            + "	t.CORREO as email,\n"
            + "	e.NOMBRE as estado,\n"
            + "	cv.PLACA_VEHICULO_ASIGNADO as placa\n"
            + "from dbagricultor.TRANSPORTISTA t \n"
            + "inner join dbagricultor.ESTADOS e \n"
            + "on e.CODIGO_ESTADO = t.ESTADO \n"
            + "inner join dbagricultor.TRANSPORTISTAS_VEHICULO tv \n"
            + "on tv.NO_LICENCIA  = t.NO_LICENCIA \n"
            + "inner join dbagricultor.CUENTA_VEHICULOS cv \n"
            + "on cv.ID_VEHICULO_ASIGNADO  = tv.ID_VEHICULO_ASIGNADO \n"
            + "where cv.ID_VENTA = :idVenta and cv.PLACA_VEHICULO_ASIGNADO = :placa", nativeQuery = true)
    List<SolicitudTransportistasProjection> getTransportistasByIdventaAndPlaca(@Param("idVenta") Integer licencias, @Param("placa") String placa);
    
}
