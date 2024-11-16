package co.edu.uniquindio.poo.model;

public class Empleado extends Persona{

    private String cargo, contrasenia, idEmpleado, username;

    private double salario;

    public Empleado(String cedula, String direccion, String nombre, String telefono, String cargo, String contrasenia,
            String idEmpleado, String username, double salario) {
        super(cedula, direccion, nombre, telefono);
        this.cargo = cargo;
        this.contrasenia = contrasenia;
        this.idEmpleado = idEmpleado;
        this.username = username;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

        

}
