package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Transaccion {

    private String idTransaccion;

    private LocalDate fecha;

    private double monto;

    private TipoTransaccion tipo;

    public Transaccion(LocalDate fecha, String idTransaccion, double monto, TipoTransaccion tipo) {
        this.fecha = fecha;
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.tipo = tipo;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }



}
