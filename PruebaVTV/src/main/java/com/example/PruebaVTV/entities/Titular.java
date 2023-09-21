package com.example.PruebaVTV.entities;

public class Titular {
    private String nombre;
    private String apellido;
    private int cantidadAutos;


    public Titular(String nombre, String apellido, int cantidadAutos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantidadAutos = cantidadAutos;
    }


    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", apellido=" + apellido + ", cantidadAutos=" + cantidadAutos + "]";
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getCantidadAutos() {
        return cantidadAutos;
    }


    public void setCantidadAutos(int cantidadAutos) {
        this.cantidadAutos = cantidadAutos;
    }

    

    
}
