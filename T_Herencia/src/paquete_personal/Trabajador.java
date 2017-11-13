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
public class Trabajador extends Persona{
 private double costo_seguro;
 private int horas_trabajadas; 
 private double costo_por_hora; 


    public Trabajador(String nom, String ap, int edad, String ced, int cos_seg, int ht, int cos_h) {
        super(nom, ap, edad, ced);
        establecer_costo_seguro(cos_seg);
        establecer_horas_trabajadas(ht);
        establecer_costo_hora(cos_h);
    }

    public void establecer_costo_seguro(int cos_seg) {
        costo_seguro = cos_seg;
    }

    public double obtener_costo_seguro() {
        return costo_seguro;
    }

    public void establecer_horas_trabajadas(int ht) {
        horas_trabajadas = ht;
    }

    public int obtener_horas_trabajadas() {
        return horas_trabajadas;
    }

    public void establecer_costo_hora(int cos_h) {
        costo_por_hora = cos_h;
    }

    public double obtener_costo_hora() {
        return costo_por_hora;
    }

    public double obtener_sueldo() {
        double sueldo;
        sueldo = (obtener_horas_trabajadas() * obtener_costo_hora() + obtener_costo_seguro());
        return sueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s" + "\tSeguro: $ %s\n"
                + "\tHoras Trabajadas: %s\n"
                + "\tValor x Hora: $ %.2s\n"
                + "\tSueldo: $ %.2f\n",
                super.toString(), obtener_costo_seguro(), obtener_horas_trabajadas(), obtener_costo_hora(), obtener_sueldo());
        return cadena;
    }
}