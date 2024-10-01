package com.mycompany.quiz2;

public abstract class VehiculoBase implements Vehiculo {

    String marca;
    String modelo;
    int velocidadActual;


    public VehiculoBase(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    
    @Override
    public void acelerar() {
        velocidadActual += 10;
        System.out.println(marca + " " + modelo + " aceleró. Velocidad actual: " + velocidadActual + " km/h.");

    }

    @Override
    public void frenar() {
        velocidadActual -= 10;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println(marca + " " + modelo + " frenó. Velocidad actual: " + velocidadActual + " km/h.");
    }
}
