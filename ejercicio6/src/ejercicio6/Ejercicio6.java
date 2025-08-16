
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 *Programa que pida un número aleatorio del 0 al 200, lo muestre y luego calcule y muestre el mismo número aumentado en un 30 %.
 * 
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        
        double number, porcentaje;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        number=teclado.nextDouble();
        
        System.out.println("El numero ingresado es "+number);
        
        porcentaje=number*0.3;
        
        System.out.println("El 30% de "+number+" es "+porcentaje);
    }
    
}
