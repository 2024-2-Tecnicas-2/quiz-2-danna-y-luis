package com.mycompany.quiz2;

public class Principal {

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 40,TipoCombustible.GASOLINA);
        Lancha lancha = new Lancha("Yamaha", "WaveRunner",60, TipoCombustible.ELECTRICO);

       
        coche.acelerar();
        coche.acelerar();
        coche.frenar();
        
        
        lancha.acelerar();       
        lancha.frenar();
        lancha.frenar();

        System.out.println("El coche utiliza: " + coche.tipoCombustible());
        System.out.println("La lancha utiliza: " + lancha.tipoCombustible());
    }
}
    
