package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Consesionario {

    private String nombre, direccion, telefono;

    private List<Empleado> listaEmpleados;

    private List<Vehiculo> listaVehiculos;

    private List<Transaccion> listaTransacciones;

    private List<Cliente> listaClientes;

    private Empleado sesionActiva;

    public Consesionario(String nombre, String direccion, String telefono, Empleado sesionActiva) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sesionActiva = sesionActiva;
        listaEmpleados = new ArrayList<>();
        listaVehiculos = new ArrayList<>();
        listaClientes = new ArrayList<>();
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

    public void registrarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);

    }

    public boolean eliminarVehiculo(String placa) {
        return listaVehiculos.removeIf(vehiculo -> vehiculo.getPlaca().equalsIgnoreCase(placa));
    }

    public List<Vehiculo> buscarVehiculosPorTipo(String tipo) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(vehiculo);
            }
        }
        return resultado;
    }

    public void vehiculosDisponibles() {
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
        }
    }


    public void registrarCliente(Cliente cliente) {
    listaClientes.add(cliente);
    }

    public Cliente buscarCliente(String cedula) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean eliminarCliente(String cedula) {
        return listaClientes.removeIf(cliente -> cliente.getCedula().equalsIgnoreCase(cedula));
    }


    public void registrarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public Empleado buscarEmpleado(String cedula) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula().equalsIgnoreCase(cedula)) {
                return empleado;
            }
        }
        return null;
    }

    public boolean eliminarEmpleado(String cedula) {
        return listaEmpleados.removeIf(empleado -> empleado.getCedula().equalsIgnoreCase(cedula));
    }
    
    public void realizarTransaccion(Transaccion transaccion) {
        listaTransacciones.add(transaccion);
    }

    public void generarReportePorTipo(TipoTransaccion tipo) {
        System.out.println("Reporte de transacciones: " + tipo);
        listaTransacciones.stream()
                .filter(transaccion -> transaccion.getTipo() == tipo)
                .forEach(System.out::println);
    }

    public Transaccion buscarTransaccion(String idTransaccion) {
        for (Transaccion transaccion : listaTransacciones) {
            if (transaccion.getIdTransaccion().equalsIgnoreCase(idTransaccion)) {
                return transaccion;
            }
        }
        return null;
    }

    public void generarReporteVentas() {
        generarReportePorTipo(TipoTransaccion.VENTA);
    }

    public void generarReportesAlquileres() {
        generarReportePorTipo(TipoTransaccion.ALQUILER);
    }

    public void generarReportesCompras() {
        generarReportePorTipo(TipoTransaccion.COMPRA);
    }

    public boolean iniciarSesionEmpleado(String username, String contrasenia) {
        // Verificar si ya hay una sesión activa
        if (sesionActiva != null) {
            System.out.println("Ya hay una sesión activa con el usuario: " + sesionActiva.getUsername());
            return false;
        }
    
        // Buscar al empleado y verificar las credenciales
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getUsername().equalsIgnoreCase(username) && 
                empleado.getContrasenia().equals(contrasenia)) {
                sesionActiva = empleado; // Registrar la sesión activa
                System.out.println("Inicio de sesión exitoso para el usuario: " + username);
                return true;
            }
        }
    
        // Mensaje de credenciales incorrectas
        System.out.println("Credenciales incorrectas.");
        return false;
    }

    public boolean recuperarContrasenia(String username) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getUsername().equalsIgnoreCase(username)) {
                System.out.println("Nueva contraseña: 123456 (Ejemplo: enviarla por correo)");
                empleado.setContrasenia("123456");
                return true;
            }
        }
        return false;
    }

    public void cerrarSesion() {
        sesionActiva = null;
    }

    public void verificarEstadoVehiculo(EstadoVehiculo estado) {
        System.out.println("Vehículos con estado: " + estado);
        // Filtramos los vehículos por estado y los mostramos
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getEstado() == estado) {
                System.out.println(vehiculo); // Imprime el vehículo si coincide con el estado
            }
        }
    }

    //+ calcularCosto

}
