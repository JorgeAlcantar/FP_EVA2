
package eva2_26_adivinar_while;

import java.util.Scanner;


public class EVA2_26_ADIVINAR_WHILE {


    public static void main(String[] args) {
        // ADIVINAR CON WHILE
        Scanner input = new Scanner(System.in);
        int valor = 0, adivinar;
        while(valor != -1){
            adivinar = (int)(Math.random() * 5);
            System.out.print("Adivina un número entre 0 y 5: ");
            valor = input.nextInt();
            if(valor == adivinar){
                System.out.println("¡¡¡ADIVINASTE!!!");
            
            }
        
        
        }
    }
    
}
