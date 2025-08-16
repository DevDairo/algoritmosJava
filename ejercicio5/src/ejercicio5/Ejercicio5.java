
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 *Hacer un programa que pida un número por teclado y luego imprima el número siguiente al ingresado.
 * 
 */
public class Ejercicio5 {

 public static void main(String[] args) {
    
        int number,sig;
    
        //Ingresar valores por teclado
        Scanner teclado= new Scanner(System.in);
            
        System.out.println("Ingrese un numero");
        number=teclado.nextInt();
        
        sig=number+1;
        
        System.out.println("El numero siguiente a "+number+ " es "+sig);
    }
    
}