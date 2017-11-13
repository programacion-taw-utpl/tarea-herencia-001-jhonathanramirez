/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import paquete_la_empresa.EmpresaPrivada;
import paquete_personal.Trabajador;
/**
 *
 * @author Usuario
 */
public class Principal {
     public static void main(String[] args) {
        // TODO code application logic here
        Trabajador t = new Trabajador("Ana Luisa","Velez Alcivar", 30, "12903939", 100, 40, 10);
        
        Trabajador t2 = new Trabajador("Mario Anibal", "Vela Narvaez", 35, "212889", 100, 50, 10);
        
        Trabajador[] tr = {t , t2};
        
        EmpresaPrivada Em_priv = new EmpresaPrivada("Soluciones Software", "SS's", "Loja", 200000, 12, tr);
        
        System.out.println(Em_priv);
}

}
