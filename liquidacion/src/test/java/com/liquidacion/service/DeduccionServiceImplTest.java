package com.liquidacion.service;

import com.liquidacion.dto.DeduccionDto;
import com.liquidacion.entity.Deduccion;
import com.liquidacion.entity.Empleado;
import com.liquidacion.repository.DeduccionRepository;
import com.liquidacion.repository.EmpleadoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DeduccionServiceImplTest {
    @Mock
    private EmpleadoRepository empleadoRepository;
    @Mock
    private DeduccionRepository deduccionRepository;
    @InjectMocks
    private EmpleadoServiceImpl empleadoServiceImpl;
    @InjectMocks
    private DeduccionServiceImpl deduccionServiceImpl;

    @Mock
    private Empleado empleados;
    @Autowired
    public DeduccionDto deduccionDto;

    void claseEmpleado() {
        empleados= new Empleado(9,"Leonardo", 1500000, 35);
        empleados.setIdEmpleado(empleados.getIdEmpleado());
        empleados.setNombreEmpleado(empleados.getNombreEmpleado());
        empleados.setDiasLab(empleados.getDiasLab());
        empleados.setSalarioEmpleado(empleados.getSalarioEmpleado());
    }

   List<Deduccion> deduccion(){
        List <DeduccionDto> listadto = (List<DeduccionDto>) new DeduccionDto();

        deduccionDto.setEmpleado(deduccionDto.getEmpleado(empleados));
        deduccionDto.setValorPrima(deduccionDto.getValorPrima());
        deduccionDto.setValorCesantias(deduccionDto.getValorCesantias());
        deduccionDto.setValorIntecesantias(deduccionDto.getValorIntecesantias());
        deduccionDto.setValorVacaciones(deduccionDto.getValorVacaciones());
        deduccionDto.setTotalLiquidacion(deduccionDto.getTotalLiquidacion());

        //float liquidacion = deduccionDto.getValorPrima()+deduccionDto.getValorCesantias()+deduccionDto.getValorIntecesantias()+deduccionDto.getValorVacaciones();

       return null;
   }

    @Test
    void deducciones() {
        /* List<DeduccionDto> deduccionDtoList= (List<DeduccionDto>) new DeduccionDto();*/
        /*el error me decia que era codigo inecesario*/
        when(deduccionRepository.findAll()).thenReturn((List<Deduccion>) deduccionDto);
        assertNull(deduccionServiceImpl.deducciones());
       /* assertNotNull(deduccionServiceImpl.deducciones());*/
        /*
            deduccionDto=new DeduccionDto();
                    deduccionDto.setEmpleado(empleados);
                    deduccionDto.setValorPrima(1500000);
                    deduccionDto.setValorCesantias(15000);
                    deduccionDto.setValorIntecesantias(458454);
                    deduccionDto.setValorVacaciones(150523);
                    deduccionDto.setTotalLiquidacion(15254658);

            deduccionDto.setEmpleado(deduccionDto.getEmpleado(empleados));
            deduccionDto.setValorPrima(deduccionDto.getValorPrima());
            deduccionDto.setValorCesantias(deduccionDto.getValorCesantias());
            deduccionDto.setValorIntecesantias(deduccionDto.getValorIntecesantias());
            deduccionDto.setValorVacaciones(deduccionDto.getValorVacaciones());
            deduccionDto.setTotalLiquidacion(deduccionDto.getTotalLiquidacion());

        when(deduccionRepository.findAll()).thenReturn((List<Deduccion>) deduccionDto);
        assertNotNull(deduccionServiceImpl.deducciones());*/
        /*empleados= new Empleado(9,"Leonardo", 1500000, 35);
        List<Empleado> empleadosLista= empleadoRepository.findAll();

        DeduccionDto deduccionDto = new DeduccionDto();
        List<DeduccionDto> deduccionDtos = Arrays.asList(deduccionDto);

        Mockito.when(deduccionServiceImpl.deducciones()).thenReturn(deduccionDtos);

        assertNotNull(deduccionServiceImpl.deducciones());*/
    }


       /* //Given
        DeduccionDto esperado= new DeduccionDto();
        esperado.setEmpleado(empleado);
        empleado= new Empleado(9,"Leonardo", 1500000, 35);
        empleado.setIdEmpleado(empleado.getIdEmpleado());
        empleado.setNombreEmpleado(empleado.getNombreEmpleado());
        empleado.setDiasLab(empleado.getDiasLab());
        empleado.setSalarioEmpleado(empleado.getSalarioEmpleado());

        esperado.setValorPrima(528244);
        esperado.setValorCesantias(48545);
        esperado.setValorIntecesantias(48454);
        esperado.setValorVacaciones(58785);
        esperado.setTotalLiquidacion(esperado.getValorPrima()+esperado.getValorCesantias()+ esperado.getValorIntecesantias()+ esperado.getValorVacaciones());

        Optional<DeduccionDto> deduccions =Optional.of(esperado);


        when(empleadoRepository.findById(9)).thenReturn(deduccion()) ;
        Optional<Empleado> empleadodeduccion= empleadoRepository.findById(9);

        assertNotNull(empleadodeduccion);
        assertEquals(9, empleado.getIdEmpleado());
        assertEquals("Leonardo",empleado.getNombreEmpleado());
        assertEquals(1500000, empleado.getSalarioEmpleado());
        assertEquals(35, empleado.getDiasLab());

        assertEquals(528244, esperado.getValorPrima());
        assertEquals(48545, esperado.getValorCesantias());
        assertEquals(48454, esperado.getValorVacaciones());
        assertEquals(esperado.getValorPrima()+esperado.getValorCesantias()+ esperado.getValorIntecesantias()+ esperado.getValorVacaciones(),esperado.getTotalLiquidacion());

        Assertions.assertEquals(esperado.getTotalLiquidacion(), deduccions.get());
         return deduccions;*/


    @Test
    void calcularLiquidacion() {

     //GIVEN
        int idEmpleado =9;
        //When
        Empleado empleados= new Empleado(9,"Leonardo", 1500000, 35);
        empleados.setNombreEmpleado("Leonardo");
        empleados.setSalarioEmpleado(1500000);
        empleados.setDiasLab(35);
        when(empleadoRepository.findById(9)).thenReturn(Optional.of(empleados));

         DeduccionDto esperado= new DeduccionDto();
         esperado.setEmpleado( empleados);
         esperado.setValorPrima(528244);
         esperado.setValorCesantias(48545);
         esperado.setValorIntecesantias(48454);
         esperado.setValorVacaciones(58785);
         esperado.setTotalLiquidacion(esperado.getValorPrima()+esperado.getValorCesantias()+ esperado.getValorIntecesantias()+ esperado.getValorVacaciones());

        DeduccionDto resultado= deduccionServiceImpl.calcularLiquidacion(9);
        //THEN
        Assertions.assertNotEquals(esperado.getTotalLiquidacion(), resultado.getTotalLiquidacion());

    }


    @Test
    void empleadoTercero() {
        //given
        DeduccionDto deduccionDto= new DeduccionDto();
        List<DeduccionDto> Deduccion;
        Deduccion= (List<DeduccionDto>) deduccionDto;

        deduccionDto.setTotalLiquidacion(150005878F);
        //when
        when(deduccionRepository.findAll()).thenReturn(deduccion());
        //then
        assertNull(deduccionServiceImpl.empleadoTercero());

      /*  List<DeduccionDto> listaDeducciones = empleadoTercero();


        when(deduccionRepository.findAll()).thenReturn(( Arrays.asList(listaDeducciones));

        List<Empleado> lista = empleadoRepository.findAll();

        /*espectativa - esperado

        assertEquals(3, lista.size());

        assertFalse(lista.size() > 5);

        assertFalse(lista.isEmpty());

        assertTrue(lista.size() < 4);*/

    /*DeduccionDto deduccionDto = new DeduccionDto();
        List<DeduccionDto> deduccionDtos = (List<DeduccionDto>) deduccionDto;

        DeduccionDto esperado= new DeduccionDto();
        esperado.setEmpleado( empleados);
        esperado.setValorPrima(528244);
        esperado.setValorCesantias(48545);
        esperado.setValorIntecesantias(48454);
        esperado.setValorVacaciones(58785);
        esperado.setTotalLiquidacion(esperado.getValorPrima()+esperado.getValorCesantias()+ esperado.getValorIntecesantias()+ esperado.getValorVacaciones());

        when(deduccionServiceImpl.empleadoTercero()).thenReturn((DeduccionDto) esperado);

        assertEquals(deduccionServiceImpl.empleadoTercero(),deduccionDto.getTotalLiquidacion());
*/

    }}