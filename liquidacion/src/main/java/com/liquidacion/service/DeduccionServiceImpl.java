package com.liquidacion.service;

import com.liquidacion.entity.Deduccion;
import com.liquidacion.entity.Empleado;

import com.liquidacion.repository.DeduccionRepository;
import com.liquidacion.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utilities.Constants;

import java.util.List;
import java.util.Optional;

@Service
 public  class DeduccionServiceImpl implements IDeducionService {
    @Autowired
    private DeduccionRepository deduccionRepository;
    @Autowired
    private EmpleadoRepository empleadoRepository;
    public Constants constants;
    @Override
    @Transactional(readOnly = true)
    public Iterable<Deduccion> mostrar() {
        Iterable<Deduccion> listaDeduccion = deduccionRepository.findAll();
        return listaDeduccion;
    }

    @Override
    public float prima(Integer id_empleado) {
        Optional<Empleado>empleado=empleadoRepository.findById(id_empleado);
        float prima =(empleado.get().getSalario_empleado()+ constants.auxilioTrans*empleado.get().getDias_lab()/constants.anio);
        return prima;
    }
    /*@Override
    public float prima(Integer id_empleado) {
        Optional<Empleado> empleado = deduccionRepository.findById_empleado(id_empleado);
        float prima = (empleado.get().getSalario_empleado() + constants.auxilioTrans) * empleado.get().getDias_lab()/constants.anio;
        return prima;
    }*/
}/*

    @Override
    public float cesantia(int idEmpleado) {
        return 0;
    }

    @Override
    public float interesesCesantias(int idEmpleado) {
        return 0;
    }

    @Override
    public float vacaciones(int idEmpleado) {
        return 0;
    }

}

/*
    @Override
    public Deduccion prima(Deduccion deduccion) {
        Optional<Empleado> prima = empleadoRepository.findById(deduccion.getEmpleado().getId_empleado());
        if(!prima.isPresent()) {
            throw new DeduccionException("El empleado con ese id no exite");
        }
        List<Empleado> salarios= empleadoRepository.getFindbySalario_empledo(deduccion.getEmpleado().getSalario_empleado());
        if(!prima.isPresent()) {
            throw new DeduccionException("salario no encontrado");
        }
        List<Empleado> diasLabo= empleadoRepository.getFindByDias_labo(deduccion.getEmpleado().getDias_lab());
        if(!prima.isPresent()) {
            throw new DeduccionException("dias laborados no encontrados");
        }

        float valor_prima = prima.get().getSalario_empleado()+constants.auxilioTrans*prima.get().getDias_lab()/constants.anio;
       /* deduccionRepository.prima(prima, empleadoRepository.getEmpleado().getId_empleado());*/

      /*  return deduccionRepository.save(deduccion);
    }
    @Override
    public Deduccion cesantias(Deduccion deduccion) {
        return null;
    }
    @Override
    public Deduccion inteCesantias(Deduccion deduccion) {
        return null;
    }
    @Override
    public Deduccion vacaciones(Deduccion deduccion) {
        return null;
    }
}
   /* @Override
    @Transactional
    public Deduccion buscarEmpleado(Deduccion deduccion){
      deduccionRepository.prima*/
    /*{
       Optional<Empleado> valor_prima = deduccionRepository.findById();
       if(!cuentaOrigen.isPresent()) {
          throw new BancoExceptions("La cuenta origen no existe");
       }*/
    /*@Override
    public Deduccion prima() {
    }*/
   /* @Override
    public Deduccion prima(float rePrima ) {
        List<Empleado> salario = deduccionRepository.findBySalario_empleado();
        List<Empleado> dias = deduccionRepository.findByDias_Labo();
        prima (salario +constants.auxilioTrans * dias/ constants.anio);
    }*/
  /*  @Override
    public Deduccion prima(int salario, float aux_trans, int dias_lab, int anio) {
        prima(deduccionRepository.findBySalario_empleado()+ constants.auxilioTrans *deduccionRepository.findByDias_Labo() /constants.anio;
        return null;
    }*/
   /* @Override
    public Deduccion prima(int salario, float aux_trans, int dias_lab, int anio) {
        prima deduccionRepository.findBySalario_empleado(int salario) + constants.auxilioTrans)* ( deduccionRepository.findByDias_Labo(int dia )/constants.anio);
        return null;
    }}*/
  /* @Override
   public Deduccion prima(int salario, float aux_trans, int dias_lab, int anio) {

      return null;
   }*/
  /*
   }
*/
/*@Transactional
    public Deduccion prima() {
        int i = 360;
        prima() = deduccionRepository.findBySalario_empleado(float salario) + constants.auxilioTrans * (deduccionRepository.findByDias_Labo(int dias)/i;
        return prima();*/
/*
    }
    @Override
    public Deduccion cesantias() {
        return null;
    }
    @Override
    public Deduccion interesDeCesantias() {
        return null;
    }
    @Override
    public Deduccion vacaciones() {
        return null;
    }
    @Override
    public Deduccion liquidacionTotal() {
        return null;
    }
}
  /*  @Override
    @Transactional
    public float prima(Deduccion deduccion) {
        prima ()= empleadoRepository.getFindbySalario_empledo() +constants.auxilioTrans
        * empleadoRepository.getFindByDias_labo() / constants.anio;
 */
    /*
    Deduccion prima(Deduccion deduccion){
        float prima= (float) ((deduccionRepository. constants.auxilioTrans)+ empleado.getDias_lab()/*constants.anio);
        return prima();
    }
    Deduccion cesantias(Deduccion deduccion){
       return cesantias();
    }
    Deduccion interesDeCesantias(Deduccion deduccion){
        return interesDeCesantias() ;
    }
    Deduccion vacaciones(Deduccion deduccion){
        return vacaciones();
    }
    Deduccion liquidacionTotal(Deduccion deduccion){
        return liquidacionTotal();
    }
}
   /* @Autowired
    private Empleado empleado;
    public Constants constants;
    float cesantias;
    float prima;
    float interesDeCesantias;
    float vacaciones;
    @Override
    /*@Transactional(readOnly = true)*/
   /* public List<Deduccion> mostrar() {
        List<Deduccion> listasDeduccion=deduccionRepository.findAll();
        return listasDeduccion;
    }
}
    /*
    @Override
    public float prima(Deduccion deduccion) {
       float prima= (float) ((deduccionRepository.getSalario_empleado()+ constants.auxilioTrans)+empleado.getDias_lab()/constants.anio);
        return prima;
    }
    @Override
    public float cesantias(Deduccion deduccion){
        float cesantias = (empleado.getSalario_empleado() * empleado.getDias_lab())/ constants.anio;
       return cesantias;
    }
    @Override
    public float interesDeCesantias(Deduccion deduccion){
        float interesesDeCesantias=( cesantias* constants.porcentaje)/ empleado.getDias_lab();
        return interesesDeCesantias ;
    }
    @Override
    public float vacaciones(Deduccion deduccion){
        float vacaciones =(empleado.getSalario_empleado()* empleado.getDias_lab()/constants.anios);
        return vacaciones;
    }
    @Override
    public float liquidacionTotal(Deduccion deduccion){
        float liquidacionTotal =(prima+cesantias+interesDeCesantias+vacaciones);
        return liquidacionTotal;}
}*/

