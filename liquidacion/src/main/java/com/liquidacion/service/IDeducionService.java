package com.liquidacion.service;

import com.liquidacion.dto.DeduccionDto;

import java.util.List;

public interface IDeducionService {

    List<DeduccionDto> deducciones();
    DeduccionDto calcularLiquidacion(Integer id_empleado);
    DeduccionDto empleadoTercero();




   /* public float cesantia(int idEmpleado);
    public float interesesCesantias(int idEmpleado);
    public float vacaciones(int idEmpleado);
    public Deduccion prima(Deduccion deduccion);
    public Deduccion cesantias(Deduccion deduccion);
    public Deduccion inteCesantias(Deduccion deduccion);
    public Deduccion vacaciones(Deduccion deduccion);
     @Transactional
     Deduccion buscarEmpleado(Deduccion deduccion);
    /Deduccion prima();
    Deduccion prima(int salario , float aux_trans, int dias_lab , int anio);
    Deduccion cesantias();
    Deduccion interesDeCesantias();
    Deduccion vacaciones();
    Deduccion liquidacionTotal();
*/
}
