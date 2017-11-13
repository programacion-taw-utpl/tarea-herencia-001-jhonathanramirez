/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_la_empresa;
import paquete_personal.Trabajador;
/**
 *
 * @author Usuario
 */
public class Empresa {
    private String nombre;
    private String siglas;
    private String ciudad;
    protected Trabajador[] trabajadores;
 
    public Empresa(String ne, String sig, String c, Trabajador[] t) {
        
        establecer_nombre(ne);
        establecer_siglas(sig);
        establecer_ciudad(c);
        establecer_trabajadores(t);
    }

    public void establecer_nombre(String ne) {
        nombre = ne;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_siglas(String sig) {
        siglas = sig;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_ciudad(String c) {
        ciudad = c;
    }

    public String obtener_ciudad() {
        return ciudad;
    }

    public void establecer_trabajadores(Trabajador[] t) {
        trabajadores = t;
    }

    @Override
    public String toString() {
        String cadena = String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s",
                obtener_nombre(), obtener_siglas(), obtener_ciudad());
        return cadena;
    }
}