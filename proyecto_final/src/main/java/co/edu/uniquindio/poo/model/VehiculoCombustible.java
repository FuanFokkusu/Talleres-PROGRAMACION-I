package co.edu.uniquindio.poo.model;

public class VehiculoCombustible extends Vehiculo{

    private int capacidadTanque;

    

    

    public VehiculoCombustible(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax,
            EstadoVehiculo estado, TipoTransmision tipoTransmision, TipoCombustible tipoCombustible,
            int capacidadTanque) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmision, tipoCombustible);
        this.capacidadTanque = capacidadTanque;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String getTipo() {
        
        return "Combustible";
    }

}
