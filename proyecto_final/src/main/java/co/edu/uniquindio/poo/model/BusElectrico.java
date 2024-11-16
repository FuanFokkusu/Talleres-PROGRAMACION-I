package co.edu.uniquindio.poo.model;

public class BusElectrico extends VehiculoElectrico{

    private int numPasajeros, numPuertas, numBolsasAire, numEjes, numSalidasEmergencia;

    private boolean aireAcondicionado, camaraReversa;

    public BusElectrico(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax,
            int autonomiaCargaCompleta, int tiempoCargaPromedio, int numPasajeros, int numPuertas, int numBolsasAire,
            int numEjes, int numSalidasEmergencia, boolean aireAcondicionado, boolean camaraReversa) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, autonomiaCargaCompleta, tiempoCargaPromedio);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.numEjes = numEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
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

    

}
