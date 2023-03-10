package com.liquidacion.service;

import com.liquidacion.entity.Empleado;
import com.liquidacion.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Override
    public List<Empleado> mostrar() {
        List<Empleado> listasEmpleados=empleadoRepository.findAll();
        return listasEmpleados;
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        empleadoRepository.save(empleado);
        return empleado;
    }

}
