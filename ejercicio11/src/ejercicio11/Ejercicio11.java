
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 *Crear un programa para calcular el porcentaje de hombres y de mujeres que hay en un grupo, dados los totales de hombres y de mujeres.
 * 
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        
        int men, women;
        double plus, promM, promW;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de hombres.");
        men=teclado.nextInt();
        
        System.out.println("Ingrese la cantidad de mujeres.");
        women=teclado.nextInt();
        
        plus=men+women;
        promM=(men/plus)*100;
        promW=(women/plus)*100;
        
        System.out.println("La cantidad total entre hombres y mujeres es "+plus+". Por lo cual, el promedio de hombres es de "+promM+"%, mientras que el de las mujeres es de "+promW+"%.");
        
    }
    
}
