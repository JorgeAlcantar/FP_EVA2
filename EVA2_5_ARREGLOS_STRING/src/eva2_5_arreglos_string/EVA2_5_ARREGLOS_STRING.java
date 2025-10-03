
package eva2_5_arreglos_string;

import java.util.Scanner;


public class EVA2_5_ARREGLOS_STRING {


    public static void main(String[] args) {
        int[] a, b, c;//SON TRES ARREGLOS
        int x[], y, z;//SOLO LA X ES UN ARREGLO
        String cadenas[] = new String[7];
        cadenas[0] = "Lunes";
        cadenas[1] = "Martes";
        cadenas[2] = "Miercoles";
        cadenas[3] = "Jueves";
        cadenas[4] = "Viernes";
        cadenas[5] = "Sabado";
        cadenas[6] = "Domingo";
        Scanner input = new Scanner(System.in);
        int dia;
        System.out.print("INTRODUCE EL DIA (0 A 6): ");
        dia = input.nextInt();
        System.out.println(cadenas[dia]);
       
    }
    
}
