package co.edu.uniquindio.poo.model;

public class DeportivoCombustible extends VehiculoCombustible{

    private int numPasajeros, numPuertas, numBolsasAire, caballosFuerza;

    private double tiempo0a100;

    public DeportivoCombustible(int capacidadTanque, int numPasajeros, int numPuertas, int numBolsasAire,
            int caballosFuerza, double tiempo0a100) {
        super(capacidadTanque);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempo0a100 = tiempo0a100;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getTiempo0a100() {
        return tiempo0a100;
    }

    public void setTiempo0a100(double tiempo0a100) {
        this.tiempo0a100 = tiempo0a100;
    }

    

}