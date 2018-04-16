package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Persona persona1 = new Persona("1234567", "juan", "perez");
        Perro perro = new Perro();

        try {
            //ESTA LINEA ME VA A ARROJAR UN CLASS CAST EXCEPTION PORQUE EL EQUALS ESTA
            //HECHO A PROPOSITO PARA QUE NO CORROBORE SI PUEDE HACERSE EL CASTEO CORRECTAMENTE
            //POR LO TANTO EXPLOTARÍA EL PROGRAMA SINO ESTUVIESE EL CATCH.
            persona1.equals(perro);
            //ESTA LINEA DE ABAJO NO LLEGARÁ A EJECUTARSE PORQUE LA LINEA DE ARRIBA VA A DISPARAR
            //LA CLASS CAST EXCEPTION E IRA DIRECTO AL "CATCH" SIN PASAR POR LA LINEA DE ABAJO
            System.out.println("estoy en el try luego de la linea problematica");
        } catch (ClassCastException e) {
            //IMPRIME EN LA CONSOLA INFORMACION DEL ERROR QUE SE CAPTURÓ.
            e.printStackTrace();
            System.out.println("estoy en el catch");
        }
    }
}
