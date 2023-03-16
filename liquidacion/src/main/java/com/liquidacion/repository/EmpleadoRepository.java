package com.liquidacion.repository;

import com.liquidacion.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {

    /*List<Empleado> findAll();*/


    /*@Override
    Optional<Empleado> findById(Integer integer);*/

    /* boolean getSalario_empleado();*/
   /* List<Empleado>getFindbySalario_empledo(float salarioEmpleado);
    List<Empleado>getFindByDias_labo(int diasLaborados);

    Empleado getEmpleado();*/


    /*List<Empleado> getFindByDias_labo();
    List<Empleado>getFindbySalario_empledo();*/

}
