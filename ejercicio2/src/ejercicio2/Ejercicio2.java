
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 * Realice un programa que solicite dos datos: país y capital. Y luego muestre la capital del país. El cartel debe ser como lo indica el siguiente ejemplo: “Katmandú es la capital de Nepal”.
 * 
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
    
        String country, capital;
    
        //Ingresar valores por teclado
        Scanner teclado= new Scanner(System.in);
            
        System.out.println("Ingrese el pais");
        country=teclado.nextLine();
 
        System.out.println("Ingrese la capital");
        capital=teclado.nextLine();
         
 
        System.out.println(capital+" es la capital de "+country);
        
    }
    
}
