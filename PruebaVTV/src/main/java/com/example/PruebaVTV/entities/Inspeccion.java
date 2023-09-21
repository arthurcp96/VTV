package com.example.PruebaVTV.entities;

import com.example.PruebaVTV.enums.EstadoInspeccion;

public class Inspeccion {
    private int nroInspeccion;
    private int fechaInspeccion;
    private EstadoInspeccion estadoInspeccion;
    private String exento;
    private String inspector;

    
    public Inspeccion(int nroInspeccion, int fechaInspeccion, EstadoInspeccion estadoInspeccion, String exento,
            String inspector) {
        this.nroInspeccion = nroInspeccion;
        this.fechaInspeccion = fechaInspeccion;
        this.estadoInspeccion = estadoInspeccion;
        this.exento = exento;
        this.inspector = inspector;
    }

    @Override
    public String toString() {
        return "Inspeccion [nroInspeccion=" + nroInspeccion + ", fechaInspeccion=" + fechaInspeccion
                + ", estadoInspeccion=" + estadoInspeccion + ", exento=" + exento + ", inspector=" + inspector + "]";
    }

    public int getNroInspeccion() {
        return nroInspeccion;
    }

    public void setNroInspeccion(int nroInspeccion) {
        this.nroInspeccion = nroInspeccion;
    }

    public int getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(int fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public EstadoInspeccion getEstadoInspeccion() {
        return estadoInspeccion;
    }

    public void setEstadoInspeccion(EstadoInspeccion estadoInspeccion) {
        this.estadoInspeccion = estadoInspeccion;
    }

    public String getExento() {
        return exento;
    }

    public void setExento(String exento) {
        this.exento = exento;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    
    
    
}
