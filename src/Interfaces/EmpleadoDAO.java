package Interfaces;

import Main.Empleado;

import java.util.ArrayList;

public class EmpleadoDAO implements IEmpleadoDAO{

    private ArrayList<Empleado> empleado;

    public EmpleadoDAO() {
        this.empleado = new ArrayList<>();
    }

    @Override
    public void agregarEmpleado(Empleado emp) {
        empleado.add(emp);
        System.out.println("Empleado agregado exitosamente");
    }

    @Override
    public Empleado obtenerEmpleado(String nombre) {

        if (empleado != null) {
            for (Empleado emp : empleado) {
                if (emp.getNombre().equals(nombre)) {
                    return emp;
                }
            }
        }
        System.out.println("No se encontro el empleado");
        return null;
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        if (empleado != null) {
            for (Empleado emp : empleado) {
                if (emp.getNombre().equals(nombre)) {
                    empleado.remove(emp);
                    System.out.println("Empleado eliminado exitosamente");
                }
            }
        }

    }

    @Override
    public void actualizarEmpleado(Empleado emp) {
        emp.setNombre("DiegoM");
        emp.setPuesto("nose");
        emp.setSalario(5000000);
    }
}
