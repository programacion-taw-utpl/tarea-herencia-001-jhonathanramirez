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
public class EmpresaPrivada extends Empresa{

    private double ventas_mensual_fijo;
    private int numero_sucursales;
   

    public EmpresaPrivada(String ne, String sig, String c, int ventas_m, int num_suc, Trabajador[] t) {
        super (ne, sig, c, t);
          establecer_ventas_m(ventas_m);
          establecer_numero_sucursales(num_suc);
    }

    public void establecer_ventas_m(int ventas) {
        ventas_mensual_fijo = ventas;
    }

    public double obtener_ventas_m() {
        return ventas_mensual_fijo;
    }

    public void establecer_numero_sucursales(int num_suc) {
        numero_sucursales = num_suc;
    }

    public int obtener_numero_sucursales() {
        return numero_sucursales;
    }

    public Trabajador[] obtener_trabajadores() {
        return trabajadores;
    }

    @Override
    public String toString() {
        String trabajadores = "";
        Trabajador[] A = obtener_trabajadores();        
        for (int i = 0; i < A.length; i++) {
            trabajadores = String.format("%s%s", trabajadores, A[i]);
        }
        String cadena = String.format("%s\n"
                + "Ventas: $ %.2f\n"
                + "Sucursales: %s\n \n"
                + "Lsta de Trabajadores:"
                + "%s",
                super.toString(), obtener_ventas_m(), obtener_numero_sucursales(), trabajadores);
        return cadena;
    }
}
