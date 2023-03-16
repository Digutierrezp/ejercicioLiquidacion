package com.liquidacion.service;

import com.liquidacion.entity.Empleado;

import java.util.List;

public interface IEmpleadoService {
    List<Empleado> mostrar();
    Empleado guardar(Empleado empleado);
    Empleado buscarPorId(Integer idEmpleado);


}
