package com.liquidacion.controller;

import com.liquidacion.dto.DeduccionDto;
import com.liquidacion.entity.Empleado;
import com.liquidacion.repository.DeduccionRepository;
import com.liquidacion.repository.EmpleadoRepository;
import com.liquidacion.service.DeduccionServiceImpl;
import com.liquidacion.service.EmpleadoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
/*@WebAppConfiguration*/
@AutoConfigureMockMvc
class DeduccionesControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;
   /* @Mock
    private EmpleadoRepository empleadoRepository;
    @InjectMocks
    private EmpleadoServiceImpl empleadoServiceImpl;
    @Autowired
    private Empleado empleado;
    @Mock
    private DeduccionRepository deduccionRepository;
    @InjectMocks
    private DeduccionServiceImpl deduccionServiceImpl;*/

    void setUp() {
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    void deducciones() throws Exception {
        MvcResult mockMvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/deduccion")
                        .contentType(org.springframework.http.MediaType.APPLICATION_JSON))
                .andReturn();
        assertNotEquals(400, mockMvcResult.getResponse().getStatus());

    }

    @Test
    void cacularLiquidacion() throws Exception {
        MvcResult mockMvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/calcularLiquidacion/{id}")
                        /*.queryParam(empleado.setIdEmpleado(buildEmpleado().getIdEmpleado()))*/
                        .contentType(org.springframework.http.MediaType.APPLICATION_JSON))
                .andReturn();
        assertEquals(200, mockMvcResult.getResponse().getStatus());


    }
    @Test
    void empleadoTercero() throws Exception {
        MvcResult mockMvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/tercero")
                        .contentType(org.springframework.http.MediaType.APPLICATION_JSON))
                .andReturn();
        assertNotEquals(400, mockMvcResult.getResponse().getStatus());
    }
}