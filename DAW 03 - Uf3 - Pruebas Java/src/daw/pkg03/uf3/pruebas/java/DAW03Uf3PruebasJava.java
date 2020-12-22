/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.pkg03.uf3.pruebas.java;

/**
 *
 * @author rober
 */
public class DAW03Uf3PruebasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
float precio;

System.out.println("Introduce el precio de tu producto");

System.in.read(precio);

float descuento = (precio<50F)?precio*0.05F:precio*0.10F;
System.out.println("Precio: "+precio);
System.out.println("Descuento: "+descuento);
System.out.println("Total: "+(precio-descuento));
       

    }
    
}
