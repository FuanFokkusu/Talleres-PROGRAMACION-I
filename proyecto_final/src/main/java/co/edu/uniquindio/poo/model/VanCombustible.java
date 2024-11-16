package co.edu.uniquindio.poo.model;

public class VanCombustible extends VehiculoCombustible{

    private int numerPasajeros, numPuertas, capacidadMaletero, numBolsasAire;

    private boolean aireAcondicionado, camaraReversa, abs;

    public VanCombustible(int capacidadTanque, int numerPasajeros, int numPuertas, int capacidadMaletero,
            int numBolsasAire, boolean aireAcondicionado, boolean camaraReversa, boolean abs) {
        super(capacidadTanque);
        this.numerPasajeros = numerPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numBolsasAire = numBolsasAire;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
    }

    public int getNumerPasajeros() {
        return numerPasajeros;
    }

    public void setNumerPasajeros(int numerPasajeros) {
        this.numerPasajeros = numerPasajeros;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    

}
