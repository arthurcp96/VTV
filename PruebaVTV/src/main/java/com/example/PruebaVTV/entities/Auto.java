package com.example.PruebaVTV.entities;

public class Auto {
    private String dominio;
    private String marca;
    private String modelo;
    private String nombrePropietario;
    private int fechaVencimiento;
    private int matricula;
    private int puertas;


    public Auto(String dominio, String marca, String modelo, String nombrePropietario, int fechaVencimiento) {
        this.dominio = dominio;
        this.marca = marca;
        this.modelo = modelo;
        this.nombrePropietario = nombrePropietario;
        this.fechaVencimiento = fechaVencimiento;
    }


    @Override
    public String toString() {
        return "Auto [dominio=" + dominio + ", marca=" + marca + ", modelo=" + modelo + ", nombrePropietario="
                + nombrePropietario + ", fechaVencimiento=" + fechaVencimiento + "]";
    }


    public String getDominio() {
        return dominio;
    }


    public void setDominio(String dominio) {
        this.dominio = dominio;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getNombrePropietario() {
        return nombrePropietario;
    }


    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }


    public int getFechaVencimiento() {
        return fechaVencimiento;
    }


    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    


    
    

    
}
