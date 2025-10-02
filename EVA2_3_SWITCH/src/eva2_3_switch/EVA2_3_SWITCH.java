
package eva2_3_switch;

import java.util.Scanner;


public class EVA2_3_SWITCH {


    public static void main(String[] args) {
        String valor = "lunes";
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE UN DÍA: ");
        valor = input.nextLine();
        switch(valor){
            case "Lunes":
                System.out.println(1);
                break;
            case "Martes":
                System.out.println(2);
                break;
            case "Miercoles":
                System.out.println(3);
                break;
            case "Jueves":
                System.out.println(4);
                break;
            case "Viernes":
                System.out.println(5);
                break;
            case "Sabado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
            default: 
                System.out.println("Numero no identificado");
        
        }
    }
    
}
