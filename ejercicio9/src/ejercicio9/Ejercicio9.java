
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Dairo Montiel
 *Crear un programa para ingresar dos palabras (A, B) y luego realice el intercambio de sus valores. Finalmente mostrar el contenido de A y de B.
 * 
 */
public class Ejercicio9 {

      public static void main(String[] args) {
        
        String word, word2, aux;
          
        Scanner teclado=new Scanner(System.in);
        
        System.out.println(" Ingresa la primera palabra ");
        word=teclado.nextLine();
      
        System.out.println(" Ingresa la segunda palabra ");
        word2=teclado.nextLine();
        
        aux=word;
        word=word2;        
        word2=aux;
        
        System.out.println("Al intercambiar las palabras queda de la siguiente manera, "+word+" , "+word2+".");
        
    }
    
}
