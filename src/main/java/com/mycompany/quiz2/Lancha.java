package com.mycompany.quiz2;

public class Lancha extends VehiculoBase {

    public TipoCombustible tipoCombustible;

    public Lancha(String marca, String modelo, int velocidadActual,TipoCombustible tipoCombustible) {
        super(marca, modelo, velocidadActual);
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public TipoCombustible tipoCombustible(){
       return  tipoCombustible;
 }
}


