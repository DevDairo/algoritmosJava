
package ejercicio3;

import java.util.Scanner;


/**
 *
 * @author Dairo Montiel
 *Crear un progrma que muestre por pantalla el doble y el triple de un número ingresado por teclado.
 * 
 */
public class Ejercicio3{
    
    public static void main(String[] args) {
    
        int number, doble, triple;
    
        //Ingresar valores por teclado
        Scanner teclado= new Scanner(System.in);
            
        System.out.println("Ingrese un numero");
        number=teclado.nextInt();
 
        doble=number*2;
        triple=number*3;
        
        System.out.println("El doble de "+number+ " es "+doble);
        System.out.println("El triple de "+number+" es "+triple);
    }
    
}
