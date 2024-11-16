package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Consesionario {

    private String nombre, direccion, telefono;

    private List<Empleado> listaEmpleados;

    private List<Vehiculo> listaVehiculos;

    private List<Transaccion> listaTransacciones;

    public Consesionario(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        listaEmpleados = new ArrayList<>();
        listaVehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void registrarVehiculo(Vehiculo vehiculo){

    }

    + eliminarVehiculo(String placa)

    + buscarVehiculoPorTipo()

    + vehiculosDisponibles()

    + registrarCliente(Cliente cliente)

    + buscarCliente(String cedula)

    + eliminarCliente(String cedula)

    + registrarEmpleado(Empleado empleado)

    + buscarEmpleado(String cedula)

    + eliminarEmpleado(String cedula)
    
    + realizarTransaccion(Transaccion transaccion)

    + listarTransacciones()

    + buscarTransaccion(String idTransaccion)

    + generarReporteVentas()

    + generarReportesAlquileres()

    + generarReportesCompras()

    + iniciarSesionEmpleado(String username, String contrasenia)

    + recuperarContrasenia(String username)

    + cerrarSesion()

    + verificarEstadoVehiculo()

    + calcularCosto

}
