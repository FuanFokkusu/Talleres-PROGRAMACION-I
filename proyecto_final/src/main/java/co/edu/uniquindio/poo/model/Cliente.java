package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{

    private String email;

    private List<Transaccion> listaTransacciones;

    public Cliente(String cedula, String direccion, String nombre, String telefono, String email) {
        super(cedula, direccion, nombre, telefono);
        this.email = email;
        listaTransacciones = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(List<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }





}
