
package eva2_1_examen;

import java.util.Scanner;


public class EVA2_1_EXAMEN {

public static void main(String[] args) {
        int tiemponata, tiempocicli, tiempocarrera;
        int tiempototal;
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE EL TIEMPO DE NATACION");
        tiemponata = input.nextInt();
        System.out.println("INTRODUCE EL TIEMPO DE CICLISMO");
        tiempocicli = input.nextInt();
        System.out.println("INTRODUCE EL TIEMPO DE CARRERA");
        tiempocarrera = input.nextInt();
        tiempototal = tiemponata + tiempocicli + tiempocarrera;
        if(tiempototal < 120 && tiemponata < 60 && tiempocicli < 60 && tiempocarrera < 60){
            System.out.println("CLASIFICACIÓN: EXCELENTE");
        
        }else if(tiempototal < 150 || tiemponata < 70 || tiempocarrera < 70){
            System.out.println("CLASIFICACIÓN: BIEN");
            
        }else{
            System.out.println("CLASIFICACIÓN: REGULAR");
        }
    }
    
}
