package com.liquidacion.dto;

import com.liquidacion.entity.Empleado;
/*import lombok.Data;

@Data*/

public class DeduccionDto {
    private Empleado empleado;
    private float valorPrima;
    private float valorCesantias;
    private float valorIntecesantias;
    private float valorVacaciones;
    private float totalLiquidacion;

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public float getValorPrima() {
        return valorPrima;
    }

    public void setValorPrima(float valorPrima) {
        this.valorPrima = valorPrima;
    }

    public float getValorCesantias() {
        return valorCesantias;
    }

    public void setValorCesantias(float valorCesantias) {
        this.valorCesantias = valorCesantias;
    }

    public float getValorIntecesantias() {
        return valorIntecesantias;
    }

    public void setValorIntecesantias(float valorIntecesantias) {
        this.valorIntecesantias = valorIntecesantias;
    }

    public float getValorVacaciones() {
        return valorVacaciones;
    }

    public void setValorVacaciones(float valorVacaciones) {
        this.valorVacaciones = valorVacaciones;
    }

    public float getTotalLiquidacion() {
        return totalLiquidacion;
    }

    public void setTotalLiquidacion(float totalLiquidacion) {
        this.totalLiquidacion = totalLiquidacion;
    }
}
