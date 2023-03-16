package com.liquidacion.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;

    private String nombreEmpleado;

    private float salarioEmpleado;
   @Column
    private Integer diasLab;


    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public float getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(float salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    public Integer getDiasLab() {
        return diasLab;
    }

    public void setDiasLab(Integer diasLab) {
        this.diasLab = diasLab;
    }
}
