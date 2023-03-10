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
    private float valor_prima;
    @Column
    private float valor_cesantias;

    @Column
    private float valor_intecesantias;

    @Column
    private float valor_vacaciones;
    @Column
    private float total_liquidacion;

    public float getValor_intecesantias() {
        return valor_intecesantias;
    }

    public void setValor_intecesantias(float valor_intecesantias) {
        this.valor_intecesantias = valor_intecesantias;
    }

    public Empleado getEmpleado() {
        return empleado;
    }


    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public float getValor_prima() {
        return valor_prima;
    }

    public void setValor_prima(float valor_prima) {
        this.valor_prima = valor_prima;
    }

    public float getValor_cesantias() {
        return valor_cesantias;
    }

    public void setValor_cesantias(float valor_cesantias) {
        this.valor_cesantias = valor_cesantias;
    }
    public float getValor_vacaciones() {
        return valor_vacaciones;
    }

    public void setValor_vacaciones(float valor_vacaciones) {
        this.valor_vacaciones = valor_vacaciones;
    }

    public float getTotal_liquidacion() {
        return total_liquidacion;
    }

    public void setTotal_liquidacion(float total_liquidacion) {
        this.total_liquidacion = total_liquidacion;
    }
}
