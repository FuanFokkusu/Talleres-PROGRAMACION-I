package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {

    private String marca, placa, modelo;

    private int cambios, cilindraje, velocidadMax;
    
    private EstadoVehiculo estado;

    private TipoTransmision tipoTransmision;

    private TipoCombustible tipoCombustible;

    


    public Vehiculo(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax,
            EstadoVehiculo estado, TipoTransmision tipoTransmision, TipoCombustible tipoCombustible) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.cambios = cambios;
        this.cilindraje = cilindraje;
        this.velocidadMax = velocidadMax;
        this.estado = estado;
        this.tipoTransmision = tipoTransmision;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }

    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    public abstract String getTipo();
    

}
