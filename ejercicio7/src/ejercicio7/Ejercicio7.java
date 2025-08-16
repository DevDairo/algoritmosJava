package ejercicio7;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Dairo Montiel
 *Diseñar un algoritmo que genere un número aleatorio del 10 al 50, lo muestre y luego calcule y muestre el mismo número disminuido en un 15 %.
 * 
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        
        double number, disminuye, total;
        
        number = ThreadLocalRandom.current().nextInt(10, 51); 
        System.out.println("El numero generado es: "+number);
        
        disminuye=number*0.15; 
        total=number-disminuye;
        System.out.println("Si "+number+" disminuye un 15%, da como resultado "+total);
        
    }
    
}
