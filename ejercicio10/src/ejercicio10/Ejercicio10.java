
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 *Hacer un programa que calcule si dos números son divisibles. Para ello, se piden un primer número y un segundo número, entonces mostrar un cartel que diga “es divisible” si el segundo número es divisible al primero.
 * 
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        double number, number2;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero ");
        number=teclado.nextDouble();
        
        System.out.println("Imgrese el segundo numero ");
        number2=teclado.nextDouble();
        
            if (number2 % number == 0){
        
                System.out.println("Los numeros son divisibles, dando como residuo 0.");    
              }else {
        
               System.out.println("El numero "+number+ " no es divisible con "+number2);        
             }
           
      }
    
}
