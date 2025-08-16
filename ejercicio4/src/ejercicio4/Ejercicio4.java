
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 *Crear un programa que imprima el cuadrado y el cubo de un número ingresado por teclado.
 * 
 */
public class Ejercicio4 {

    public static void main(String[] args) {
    
        int number, cuadrado, cubo;
    
        //Ingresar valores por teclado
        Scanner teclado= new Scanner(System.in);
            
        System.out.println("Ingrese un numero");
        number=teclado.nextInt();
 
        cuadrado= (int) Math.pow(number, 2);
        cubo=(int) Math.pow(number, 3);
        
        System.out.println("El cuadrado de "+number+ " es "+cuadrado);
        System.out.println("El cubo de "+number+" es "+cubo);
    }
    
}
