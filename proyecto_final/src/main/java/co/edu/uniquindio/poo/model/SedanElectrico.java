package co.edu.uniquindio.poo.model;

public class SedanElectrico extends VehiculoElectrico{

    private int numPasajeros, numPuertas, capacidadMaletero, numBolsasAire;

    private boolean aireAcondicionado, camaraReversa, velocidadCrucero, abs, sensoresColision, sensorTraficoCrusado, asistenciaPermanenciaCarril;

    public SedanElectrico(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax,
            int autonomiaCargaCompleta, int tiempoCargaPromedio, int numPasajeros, int numPuertas,
            int capacidadMaletero, int numBolsasAire, boolean aireAcondicionado, boolean camaraReversa,
            boolean velocidadCrucero, boolean abs, boolean sensoresColision, boolean sensorTraficoCrusado,
            boolean asistenciaPermanenciaCarril) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, autonomiaCargaCompleta, tiempoCargaPromedio);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numBolsasAire = numBolsasAire;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.abs = abs;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCrusado = sensorTraficoCrusado;
        this.asistenciaPermanenciaCarril = asistenciaPermanenciaCarril;
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

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isSensorTraficoCrusado() {
        return sensorTraficoCrusado;
    }

    public void setSensorTraficoCrusado(boolean sensorTraficoCrusado) {
        this.sensorTraficoCrusado = sensorTraficoCrusado;
    }

    public boolean isAsistenciaPermanenciaCarril() {
        return asistenciaPermanenciaCarril;
    }

    public void setAsistenciaPermanenciaCarril(boolean asistenciaPermanenciaCarril) {
        this.asistenciaPermanenciaCarril = asistenciaPermanenciaCarril;
    }

    
}
