
package eva2_31_piramide;

import java.util.Scanner;


public class EVA2_31_PIRAMIDE {


    public static void main(String[] args) {
        // SOLICITUD DE DATOS PARA GENERAR UNA PIRAMIDE}
        //Scanner
        Scanner input = new Scanner(System.in);
        //SOLICITAR DATOS
        System.out.println("INTRODUCE UN NÚMERO PARA GENERAR UNA PIRAMIDE");
        //INTRODUCIR DATOS
        int numero;
        String valor = "*";
        numero = input.nextInt();
        for(int i = 0; i < numero; i++){
            System.out.println(valor);
            valor += "*";
        }
        for (int i = numero - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
