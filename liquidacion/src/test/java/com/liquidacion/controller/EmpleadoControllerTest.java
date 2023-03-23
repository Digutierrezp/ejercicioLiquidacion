package com.liquidacion.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liquidacion.entity.Empleado;
import com.liquidacion.repository.EmpleadoRepository;
import com.liquidacion.service.EmpleadoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
/*@WebAppConfiguration*/
@AutoConfigureMockMvc
class EmpleadoControllerTest {
   /* private final static String BASE_URL="/api";*/
    @Autowired
    MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;
   /* @Mock
    private EmpleadoRepository empleadoRepository;
    @InjectMocks
    private EmpleadoServiceImpl empleadoServiceImpl;
    @Autowired
    public  EmpleadoController empleadoController;*/
    private Empleado empleado;
    void setUp() {
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    void mostrar() throws Exception {
        MvcResult mockMvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/empleados")
                .contentType(org.springframework.http.MediaType.APPLICATION_JSON))
        .andReturn();
        assertEquals(404, mockMvcResult.getResponse().getStatus());

    }

    @Test
    void buscarPorId() throws Exception {
      MvcResult mockMvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/empleados/{id}")
                      /*.queryParam(empleado.setIdEmpleado(buildEmpleado().getIdEmpleado()))*/
              .contentType(org.springframework.http.MediaType.APPLICATION_JSON))
        .andReturn();
        assertEquals(200, mockMvcResult.getResponse().getStatus());

    }

    @Test
    void guardar() throws Exception {
        Empleado empleado=buildEmpleado();


        MvcResult mockMvcResult=mockMvc.perform(MockMvcRequestBuilders.post("/empleados")
                .accept(MediaType.APPLICATION_JSON))
                /*.content(mapToJson(empleado))*/
                .andReturn();
        assertNotEquals(201,mockMvcResult.getResponse().getStatus());


    }

    //pasar el empleado a json
    private String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
    private Empleado buildEmpleado(){
        Empleado empleado= new Empleado();
        empleado.setIdEmpleado(15);
        empleado.setNombreEmpleado("Dayanith");
        empleado.setSalarioEmpleado(1505565);
        empleado.setDiasLab(45);
        return empleado;
    }
    }
