package co.edu.uniquindio.poo.model;

public class MotoCombustible extends VehiculoCombustible{

    private int anioFabricacion;

    public MotoCombustible(int capacidadTanque, int anioFabricacion) {
        super(capacidadTanque);
        
        this.anioFabricacion = anioFabricacion;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    
}
