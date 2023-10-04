package com.example.primeratarea.Entidad;

public class operacionLogica {

    private int numero1, numero2;

    public operacionLogica(int n1, int n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    //Metodo De Operacion Suma
    public int operacionSumas(){
        int suma = numero1 + numero2;
        return suma;
    }

    public int operacionResta(){
        int resta = numero1 - numero2;
        return resta;
    }

    public int operacionMulti(){
        int multi = numero1 * numero2;
        return multi;
    }

    public int operacionDivi(){
        int divi = numero1 / numero2;
        return divi;
    }


}
