package com.liquidacion.controller;

import com.liquidacion.entity.Empleado;
import com.liquidacion.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
    @Autowired
    private IEmpleadoService iEmpleadoService;
    @GetMapping("/empleados")
    public List<Empleado> mostrar() {
        List<Empleado> listaEmpleado = iEmpleadoService.mostrar();
        return listaEmpleado;
    }
    @GetMapping("/empleados/{id}")
    public Empleado buscarPorId(@PathVariable ("id")Integer idEmpleado) {
       Empleado empleado= iEmpleadoService.buscarPorId(idEmpleado);
        return empleado;
    }
    @PostMapping("/empleados")
    public Empleado guardar(@RequestBody Empleado empleado) {
        iEmpleadoService.guardar(empleado);
        return empleado;}
}
