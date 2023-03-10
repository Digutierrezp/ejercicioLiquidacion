package com.liquidacion.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_empleado;

    private String nombre_empleado;

    private float salario_empleado;
   @Column
    private Integer dias_lab;
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public float getSalario_empleado() {
        return salario_empleado;
    }

    public Integer getDias_lab() {
        return dias_lab;
    }

    public void setDias_labo(Integer dias_labo) {
        this.dias_lab = dias_lab;
    }

    public void setSalario_empleado(float salario_empleado) {
        this.salario_empleado = salario_empleado;


    }
}
