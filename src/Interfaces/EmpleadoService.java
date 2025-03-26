package Interfaces;

import Main.Empleado;

public class EmpleadoService implements IEmpleadoService{
    private IEmpleadoDAO empleadoDAO;

    public EmpleadoService(){
        this.empleadoDAO = new EmpleadoDAO();
    }

    @Override
    public void agregarEmpleado(Empleado emp) {
        empleadoDAO.agregarEmpleado(emp);
    }

    @Override
    public Empleado obtenerEmpleado(String nombre) {
        return empleadoDAO.obtenerEmpleado(nombre);
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        empleadoDAO.eliminarEmpleado(nombre);
    }

    @Override
    public void actualizarEmpleado(Empleado emp) {
        empleadoDAO.actualizarEmpleado(emp);
    }
}
