package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Farmacia {

    private String nombre;
    LinkedList<Sucursal> listaSucursales;

    public Farmacia (String nombre){

        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
