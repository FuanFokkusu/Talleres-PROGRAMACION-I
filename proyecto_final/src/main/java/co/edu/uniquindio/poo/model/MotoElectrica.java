package co.edu.uniquindio.poo.model;

public class MotoElectrica extends VehiculoElectrico{

    private String anioFabricacion;

    public MotoElectrica(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax,
            int autonomiaCargaCompleta, int tiempoCargaPromedio, String anioFabricacion) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, autonomiaCargaCompleta, tiempoCargaPromedio);
        this.anioFabricacion = anioFabricacion;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    

}
