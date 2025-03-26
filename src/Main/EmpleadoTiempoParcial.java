package Main;

public class EmpleadoTiempoParcial extends Empleado{
    private int horasTrabajadas;

    public EmpleadoTiempoParcial(String nombre, String apellido, int edad, int horasTrabajadas) {
        super(nombre, apellido, edad);
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalario(){
        return (super.getSalario()*horasTrabajadas)/40;
    }


}
