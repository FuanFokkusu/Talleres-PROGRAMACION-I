package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Sucursal {

    private String nombre;
    private String ID;
    private String direccion;
    private String telefono;
    private LinkedList<Producto> listaProductos;

    public Sucursal(String nombre, String iD, String direccion, String telefono, LinkedList<Producto> listaProductos) {
        this.nombre = nombre;
        this.ID = iD;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaProductos = listaProductos;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
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

    public void agregarProducto (Producto producto){

        listaProductos.add(producto);

    }

    public void validarCodigo (Producto productoingresado){

        for (Producto producto : listaProductos){

            if (productoingresado.getCodigo() != producto.getCodigo()) {

                agregarProducto(productoingresado);
                
            }

            else {

                System.out.println("EL PRODUCTO YA EXISTE");
            }

        } 
    }

}
