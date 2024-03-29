package com.liquidacion.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Deducciones")
public class Deduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_deduccion;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
    @Column
    private float valorPrima;
    @Column
    private float valorcCesantias;

    @Column
    private float valorIntecesantias;

    @Column
    private float valorVacaciones;
    @Column
    private float totalLiquidacion;

    public Integer getId_deduccion() {
        return id_deduccion;
    }

    public void setId_deduccion(Integer id_deduccion) {
        this.id_deduccion = id_deduccion;
    }

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

    public float getValorcCesantias() {
        return valorcCesantias;
    }

    public void setValorcCesantias(float valorcCesantias) {
        this.valorcCesantias = valorcCesantias;
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
