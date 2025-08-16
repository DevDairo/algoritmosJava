
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 *Crear un programa que indique con carteles si el número ingresado es negativo, positivo o nulo.
 * 
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        double number;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        number=teclado.nextDouble();
        
        if (number<0) {
            System.out.println("El numero que ingresaste es negativo.");    
        }else if (number==0) {
            System.out.println("El numero que ingresaste es nulo.");    
        }else{
            System.out.println("El numero que ingresaste es positivo.");
        }
                  
    }
    
}
