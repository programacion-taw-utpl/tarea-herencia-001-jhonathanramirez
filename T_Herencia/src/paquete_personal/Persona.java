/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_personal;

/**
 *
 * @author Usuario
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String cedula;

    public Persona(String n, String ap, int edad, String ced) {
        establecer_nombres(n);
        establecer_apellidos(ap);
        establecer_edad(edad);
        establecer_cedula(ced);
    }

    public void establecer_nombres(String n) {
        nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_apellidos(String ap) {
        apellidos = ap;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_edad(int ed) {
        edad = ed;
    }

    public int obtener_edad() {
        return edad;
    }

    public void establecer_cedula(String ced) {
        cedula = ced;
    }

    public String obtener_cedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n\t%s"
                + " %s\n"
                + "\t%s años de edad\n"
                + "\tCI: %s\n",
                obtener_nombre(), obtener_apellidos(), obtener_edad(), obtener_cedula());
        return cadena;
    }
}
