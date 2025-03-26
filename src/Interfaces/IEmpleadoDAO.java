package Interfaces;

import Main.Empleado;

public interface IEmpleadoDAO {
    public void agregarEmpleado(Empleado emp);
    Empleado obtenerEmpleado(String nombre);
    public void eliminarEmpleado(String nombre);
    public void actualizarEmpleado(Empleado emp);

}
