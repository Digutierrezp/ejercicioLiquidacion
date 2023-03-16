package com.liquidacion.service;

import com.liquidacion.entity.Empleado;
import com.liquidacion.exceptions.EmpleadoException;
import com.liquidacion.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Empleado buscarPorId(Integer idEmpleado) {
        Optional<Empleado>empleado=empleadoRepository.findById(idEmpleado);
       if (empleado.isEmpty()){

            throw new EmpleadoException("Este empleado no existe");
        }
        return  empleado.get();
    }



}
