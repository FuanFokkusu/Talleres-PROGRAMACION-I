package co.edu.uniquindio.poo.model;

public class CamionCombustible {

    private int capacidadCarga, numEjes;

    private boolean aireAcondicionado, frenoAire, abs;

    private TipoCamion tipoCamion;

    public CamionCombustible(int capacidadCarga, int numEjes, boolean aireAcondicionado, boolean frenoAire, boolean abs, TipoCamion tipoCamion) {
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
        this.aireAcondicionado = aireAcondicionado;
        this.frenoAire = frenoAire;
        this.abs = abs;
        this.tipoCamion = tipoCamion;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenoAire() {
        return frenoAire;
    }

    public void setFrenoAire(boolean frenoAire) {
        this.frenoAire = frenoAire;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    

}
