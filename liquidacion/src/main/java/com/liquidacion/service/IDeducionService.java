package com.liquidacion.service;

import com.liquidacion.entity.Deduccion;
import org.springframework.transaction.annotation.Transactional;

public interface IDeducionService {

    Iterable<Deduccion> mostrar();
    public float prima(Integer id_empleado);
   /* public float cesantia(int idEmpleado);
    public float interesesCesantias(int idEmpleado);
    public float vacaciones(int idEmpleado);*/


    /*public Deduccion prima(Deduccion deduccion);
    public Deduccion cesantias(Deduccion deduccion);
    public Deduccion inteCesantias(Deduccion deduccion);
    public Deduccion vacaciones(Deduccion deduccion);
  /*  @Transactional
    Deduccion buscarEmpleado(Deduccion deduccion);*/
    /*  Deduccion prima();*/



    /*Deduccion prima(int salario , float aux_trans, int dias_lab , int anio);*/


   /*

    Deduccion cesantias();
    Deduccion interesDeCesantias();
    Deduccion vacaciones();
    Deduccion liquidacionTotal();
*/
}
