package co.edu.uniquindio.poo.model;

public class VehiculoHibrido extends Vehiculo{

    private boolean esEnchufable, esHibridoLigero;

    public VehiculoHibrido(boolean esEnchufable, boolean esHibridoLigero, String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax);
        this.esEnchufable = esEnchufable;
        this.esHibridoLigero = esHibridoLigero;
    }

    public boolean isEsEnchufable() {
        return esEnchufable;
    }

    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }

    public boolean isEsHibridoLigero() {
        return esHibridoLigero;
    }

    public void setEsHibridoLigero(boolean esHibridoLigero) {
        this.esHibridoLigero = esHibridoLigero;
    }





}
