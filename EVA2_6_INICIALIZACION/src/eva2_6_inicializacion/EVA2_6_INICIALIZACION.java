
package eva2_6_inicializacion;

import java.util.Scanner;


public class EVA2_6_INICIALIZACION {


    public static void main(String[] args) {
        //INICIALIZACION
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        Scanner input = new Scanner(System.in);
        int dia;
        System.out.print("INTRODUCE EL DIA (0 A 6): ");
        dia = input.nextInt();
        System.out.println(dias[dia]);
       
    }
    
}
