package com.liquidacion.controller;

import com.liquidacion.entity.Deduccion;
import com.liquidacion.service.IDeducionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeduccionesController {

    @Autowired
    private IDeducionService iDeducionService;

    @GetMapping("/deduccion")
    public Iterable<Deduccion> mostrar() {
        Iterable<Deduccion> listaDeduccion = iDeducionService.mostrar();
        return listaDeduccion;
    }
    @GetMapping("/prima/{id}")
    public float prima(@PathVariable Integer id){
        return (float) iDeducionService.prima(id);
    }

}
 /*   @PostMapping("/prima")
   public Deduccion prima(@RequestBody Deduccion deduccion){
        Deduccion deducciones = iDeducionService.prima(new Deduccion());
        return deducciones;
    }*/



     /*public ResponseEntity<?>prima(@RequestBody Deduccion deduccion)
        prima()= deduccion.getValor_prima();*/
    /*
    public List<Deduccion> mostrar() {
        List<Deduccion> listDeduccion = iDeducionService.mostrar();
        return listDeduccion;
    }

    @GetMapping("/prima")
    
    public float prima(@RequestBody Deduccion deduccion){
        float prima = deduccion.getValor_prima();
        return prima;
    }
    @GetMapping("/cesantias")
    public float cesantias(@RequestBody Deduccion deduccion){
        float cesantias= deduccion.getValor_cesantias();
        return cesantias;*/

