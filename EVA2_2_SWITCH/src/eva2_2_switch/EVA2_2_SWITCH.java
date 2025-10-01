
package eva2_2_switch;

import java.util.Scanner;


public class EVA2_2_SWITCH {


    public static void main(String[] args) {
        //SWITCH --- OPCION MULTIPLE
        Scanner input = new Scanner(System.in);
        int día;
        System.out.println("Dia de la semana (1-7)");
        día = input.nextInt();
        
        switch(día){//OPCIONES---CASOS
            case 1:
                System.out.println("Lunes");
                break;//FIN DEL CASO Y DEL SWITCH
            case 2:
                System.out.println("Martes");
                break;//FIN DEL CASO Y DEL SWITCH
            case 3:
                System.out.println("Miercoles");
                break;//FIN DEL CASO Y DEL SWITCH
            case 4:
                System.out.println("Jueves");
                break;//FIN DEL CASO Y DEL SWITCH
            case 5:
                System.out.println("Viernes");
                break;//FIN DEL CASO Y DEL SWITCH
            case 6:
                System.out.println("Sabado");
                break;//FIN DEL CASO Y DEL SWITCH
            case 7:
                System.out.println("Domingo");
                break;//FIN DEL CASO Y DEL SWITCH
            default: //OPCIONAL, SIEMPRE AL FINAL, NO SE NECESITA EL BREAK7
                System.out.println("NUMERO INCORRECTO");
        }
        
        
    }
    
}
