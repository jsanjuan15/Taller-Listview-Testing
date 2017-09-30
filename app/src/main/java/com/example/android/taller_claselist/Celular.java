package com.example.android.taller_claselist;

/**
 * Created by android on 26/09/2017.
 */

public class Celular {



    private double precio;
    private double capacidad;
    private int marca;
    private int color;
    private int sistema;




    public Celular(double precio, double capacidad, int marca, int color, int sistema) {
        this.precio = precio;
        this.capacidad = capacidad;
        this.marca = marca;
        this.color = color;
        this.sistema = sistema;


    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    public int getMarca() {
        return marca;
    }
    public void setMarca(int marca) {
        this.marca = marca;
    }
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public int getSistema() {
        return sistema;
    }
    public void setSistema(int sistema) {
        this.sistema = sistema;
    }
    public void Guardar(){
        Datos.Guardarcelulares(this);
    }
}
