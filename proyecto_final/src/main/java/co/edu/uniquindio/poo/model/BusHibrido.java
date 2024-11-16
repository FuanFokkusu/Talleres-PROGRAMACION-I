package co.edu.uniquindio.poo.model;

public class BusHibrido extends VehiculoHibrido{

    private int numeroPasajeros, numeroPuertas, capacidadMaletero, numBolsasAire, numEjes, numSalidasEmergencia;

    private boolean  aireAcondicionado, camaraReversa, abs;

    public BusHibrido(boolean esEnchufable, boolean esHibridoLigero, String marca, String placa, String modelo,
            int cambios, int cilindraje, int velocidadMax, int numeroPasajeros, int numeroPuertas,
            int capacidadMaletero, int numBolsasAire, int numEjes, int numSalidasEmergencia, boolean aireAcondicionado,
            boolean camaraReversa, boolean abs) {
        super(esEnchufable, esHibridoLigero, marca, placa, modelo, cambios, cilindraje, velocidadMax);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numBolsasAire = numBolsasAire;
        this.numEjes = numEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
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

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getNumSalidasEmergencia() {
        return numSalidasEmergencia;
    }

    public void setNumSalidasEmergencia(int numSalidasEmergencia) {
        this.numSalidasEmergencia = numSalidasEmergencia;
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
