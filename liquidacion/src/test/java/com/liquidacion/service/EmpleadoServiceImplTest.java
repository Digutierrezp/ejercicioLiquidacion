package com.liquidacion.service;

import com.liquidacion.entity.Empleado;
import com.liquidacion.repository.EmpleadoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class EmpleadoServiceImplTest {
    @Mock
    private EmpleadoRepository empleadoRepository;
    @InjectMocks
    private EmpleadoServiceImpl empleadoServiceImpl;
    @Autowired
    private Empleado empleado;

    void setUp() {
        empleado= new Empleado(9, "Leonardo", 1500000, 35);
        empleado.setIdEmpleado(empleado.getIdEmpleado());
        empleado.setNombreEmpleado(empleado.getNombreEmpleado());
        empleado.setDiasLab(empleado.getDiasLab());
        empleado.setSalarioEmpleado(empleado.getSalarioEmpleado());
    }
    @Test
    void mostrar() {
        when(empleadoRepository.findAll()).thenReturn(Arrays.asList(empleado));
        assertNotNull(empleadoServiceImpl.mostrar());
    }

    @Test
    void guardar() {
      //GIVEN
        int idEmpleado =10;
        //When
        Empleado empleados= new Empleado(10,"Leonardo", 1500000, 35);
        empleados.setNombreEmpleado("Leonardo");
        empleados.setSalarioEmpleado(1500000);
        empleados.setDiasLab(35);
        when(empleadoRepository.save(empleados)).thenReturn(empleados);

        Empleado resultado= empleadoServiceImpl.guardar(empleados);
        //THEN
        Empleado esperado = new Empleado(10,"Leonardo", 1500000,35);
        Assertions.assertEquals(esperado.getIdEmpleado(), resultado.getIdEmpleado());
    }

    @Test
    void buscarPorId() {
        //GIVEN
        int idEmpleado =9;
        //When
        Empleado empleados= new Empleado(9,"Leonardo", 1500000, 35);
        empleados.setNombreEmpleado("Leonardo");
        empleados.setSalarioEmpleado(1500000);
        empleados.setDiasLab(35);
        when(empleadoRepository.findById(9)).thenReturn(Optional.of(empleados));

        Empleado resultado= empleadoServiceImpl.buscarPorId(9);
        //THEN
        Empleado esperado= new Empleado(9,"Leonardo",1500000, 35);
        Assertions.assertEquals(esperado.getIdEmpleado(), resultado.getIdEmpleado());
    }
}
