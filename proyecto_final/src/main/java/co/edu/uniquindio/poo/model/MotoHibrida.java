package co.edu.uniquindio.poo.model;

public class MotoHibrida extends VehiculoHibrido{

    private String anioFabricacion;

    public MotoHibrida(boolean esEnchufable, boolean esHibridoLigero, String marca, String placa, String modelo,
            int cambios, int cilindraje, int velocidadMax, String anioFabricacion) {
        super(esEnchufable, esHibridoLigero, marca, placa, modelo, cambios, cilindraje, velocidadMax);
        this.anioFabricacion = anioFabricacion;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }


}
