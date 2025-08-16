
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 * Hacer un programa  que, dados dos números, muestre por pantalla su RESTA
 * 
 */
public class Ejercicio1 {

    public static void main(String[] args) {
    
        int number1, number2, resta;
    
        //Ingresar valores por teclado
        Scanner teclado= new Scanner(System.in);
            
        System.out.println("Ingrese el primer numero");
        number1=teclado.nextInt();
 
        System.out.println("Ingrese el segundo numero");
        number2=teclado.nextInt();
         
        resta=number1-number2;
 
        System.out.println("La resta de "+number1+" y "+number2+" es "+resta);
        
    }
    
}
