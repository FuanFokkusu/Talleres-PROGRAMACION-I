package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Administrador extends Empleado {

    private LocalDate fechaIngreso;

    public Administrador(String cedula, String direccion, String nombre, String telefono, String cargo,
            String contrasenia, String idEmpleado, String username, double salario, LocalDate fechaIngreso) {
            super(cedula, direccion, nombre, telefono, cargo, contrasenia, idEmpleado, username, salario);
            
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }



    



}
