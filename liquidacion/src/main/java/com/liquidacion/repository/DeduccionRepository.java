package com.liquidacion.repository;

import com.liquidacion.entity.Deduccion;
import com.liquidacion.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeduccionRepository  extends JpaRepository<Deduccion,Integer>
{
   List<Deduccion> findAll();


}
  /* @Transactional(readOnly = true)
   public Optional<Empleado> findById_empleado(Integer id_empleado);}*/

   /*
   @Modifying
    @Query("SELECT deduccion d SET d.id_deduccion = ?1  WHERE d.valor_prima=?2")
    public void  prima(Optional<Empleado> ID, float prima );*/

    /*@Query("SELECT Empleado e set e.= ?1 where c.id = ?2")
    public void actualizarSaldoCuenta(Double saldo, Integer id);*/

   /*List<Empleado>findByid(int id);*/

   /*
   Deduccion cesantias();
   Deduccion interesDeCesantias();
   Deduccion vacaciones();
   Deduccion liquidacionTotal();*/

  /*List<Empleado>findBySalario_empleado();
   List<Empleado>findByDias_Labo();*/

  /* */

    /*Set<Deduccion> findByIdDeduccions();*/

    /*Set<Deduccion> findBy();*/


