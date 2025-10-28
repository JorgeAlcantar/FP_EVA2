
package eva2_25_adivinar_numero;

import java.util.Scanner;


public class EVA2_25_ADIVINAR_NUMERO {


    public static void main(String[] args) {
        //ADIVINANZA DE UN NUMERO
        //SCANNER
        Scanner input = new Scanner(System.in);
        //VARIABLE
        int valor, adivinar;
        //CICLO DO WHILE
        do{
            adivinar = (int)(Math.random() * 5);
            System.out.print("Adivina el número entre 0 y 5 (-1 para terminar el juego): ");
            valor = input.nextInt();
            //DECLARACIONES IF
            if(valor == adivinar)
                System.out.println("¡¡¡ADIVINASTE!!!");
        
        }while(valor != -1);//CONDICIÓN PARA DETENER EL PROGRAMA
        System.out.println("TERMINA EL PROGRAMA");
        
        
    }
    
}
