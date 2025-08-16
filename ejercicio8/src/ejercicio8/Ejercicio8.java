
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 *Crear un programa que, dados tres números enteros, calcule e imprima el promedio entre ellos.
 * 
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        int number, number2, number3;
        double promedio;
        
        Scanner teclado= new  Scanner(System.in);
        
        System.out.println(" Ingrese un numero entero ");       
        number=teclado.nextInt();
        
        System.out.println(" Ingrese un numero entero ");
        number2=teclado.nextInt();
        
        System.out.println(" Ingrese un numero entero ");
        number3=teclado.nextInt();
        
        promedio=(number+number2+number3)/3;
                
        System.out.println(" El promedio de los numeros ingresados es "+promedio);        
        
    }
    
}
