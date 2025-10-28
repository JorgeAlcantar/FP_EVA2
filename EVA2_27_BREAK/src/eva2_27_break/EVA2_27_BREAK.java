
package eva2_27_break;

import java.util.Scanner;


public class EVA2_27_BREAK {


    public static void main(String[] args) {
        //BREAK
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
            if(valor == adivinar){
                System.out.println("¡¡¡ADIVINASTE!!!");
            }else if(valor == -1){
                System.out.println("GRACIAS POR JUGAR");
                break;
            
            }else{
                System.out.println("NO ADIVINASTE");
            }
        
        }while(true);//CONDICIÓN PARA DETENER EL PROGRAMA
        
        
    }
    
}
