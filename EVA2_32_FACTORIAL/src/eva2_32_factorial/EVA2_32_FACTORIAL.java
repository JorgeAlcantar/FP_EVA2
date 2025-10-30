
package eva2_32_factorial;

import java.util.Scanner;


public class EVA2_32_FACTORIAL {


    public static void main(String[] args) {
        //CALCULAR LA FACTORIAL DE UN NÚMERO
        //SCANNER
        Scanner input = new Scanner(System.in);
        //VARIABLES
        int numero;
        double facto = 1;
        //IMPRIMIR
        System.out.println("*** CALCULADORA DEL FACTORIAL DE NÚMERO ***");
        System.out.print("INTRODUCE UN NÚMERO PARA CALCULAR SU FACTORIAL: ");
        numero = input.nextInt();
        for(int i = numero; i >= 1; i--){//EL ÍNDICE INICIA EN EL NÚMERO INTRODUCIDO. TIENE QUE IR DISMINUYENDO Y NO TIENE QUE SER CERO
            System.out.print(numero + "! = " + i);
            if(i > 1){
                System.out.println(" * ");
            }
            facto *= i;
        }
        System.out.print(" = " + facto);
    }
    
}
