package co.edu.uniquindio.poo.model;

public class VehiculoElectrico extends Vehiculo{

    private int autonomiaCargaCompleta, tiempoCargaPromedio;

    public VehiculoElectrico(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax,
            int autonomiaCargaCompleta, int tiempoCargaPromedio) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax);
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        this.tiempoCargaPromedio = tiempoCargaPromedio;
    }

    public int getAutonomiaCargaCompleta() {
        return autonomiaCargaCompleta;
    }

    public void setAutonomiaCargaCompleta(int autonomiaCargaCompleta) {
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
    }

    public int getTiempoCargaPromedio() {
        return tiempoCargaPromedio;
    }

    public void setTiempoCargaPromedio(int tiempoCargaPromedio) {
        this.tiempoCargaPromedio = tiempoCargaPromedio;
    }

    

}
