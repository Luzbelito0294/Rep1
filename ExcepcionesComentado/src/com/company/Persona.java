package com.company;

/**
 * Created by ma on 03/04/18.
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido;

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public boolean equals(Object o) {

        //NO HAGO EL CHEQUEO DEL INSTANCE OF A PROPOSITO PARA QUE ROMPA LA LINEA DE ABAJO
        //CUANDO HAGA EL CASTEO SI LE PASO UN PERRO Y TRATA DE CASTEARLO A LA CLASE "PERSONA"
        Persona personaAComparar = (Persona) o;
        return (personaAComparar.getDni().equals(this.dni));
    }



}
