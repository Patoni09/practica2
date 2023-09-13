/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada.de.datos.pkg2;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class EntradaDeDatos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lectura = new Scanner (System.in);
    System.out.println("Escribe tu nombre");
    String nombre = lectura.nextLine();
            
    System.out.println("escribe tu coreo electronico");
    String correo = lectura.nextLine();
   
    System.out.println("escribe tus redsocial");
    String redsocial  = lectura.nextLine();
    
    System.out.println("escribe tu edad");
    int edad = lectura.nextInt();
    
    System.out.println("escribe tu numero telefonico");
    int telefono = lectura.nextInt();
    
   
    
    System.out.println("hola " + nombre + " ctu edad es " + edad + "correo lectronico es  " + correo + "numero telefonico es  " + telefono + "redes sociales es  " + redsocial );
    lectura.close();
        
    }
    
}
