package co.edu.uniquindio.poo.model;

public class PickUpHibrida extends VehiculoHibrido{

    private int numerPasajeros, numPuertas, capacidadMaletero, numBolsasAire;

    private boolean aireAcondicionado, camaraReversa, abs, es4x4;

    public PickUpHibrida(boolean esEnchufable, boolean esHibridoLigero, String marca, String placa, String modelo,
            int cambios, int cilindraje, int velocidadMax, int numerPasajeros, int numPuertas, int capacidadMaletero,
            int numBolsasAire, boolean aireAcondicionado, boolean camaraReversa, boolean abs, boolean es4x4) {
        super(esEnchufable, esHibridoLigero, marca, placa, modelo, cambios, cilindraje, velocidadMax);
        this.numerPasajeros = numerPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numBolsasAire = numBolsasAire;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
        this.es4x4 = es4x4;
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

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }

    

}
