/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.monedas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CalculadoraDeMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    System.out.println("escribe una cantidad");
    
    double cantidad = lectura.nextDouble();
     
    
    double euro = cantidad / 18.21;
    double dolares = cantidad / 17.07;
    double yen = cantidad / 0.12;
    double libras = cantidad / 21.18;
    
        System.out.println("hola su cantidad es" + cantidad 
                + "en euro es" + euro
                + "en dolares es " + dolares
                + " yen es" + yen
                + "en libras es " + libras);
        
    
    
   
   
        
       
        
    }
    
}
