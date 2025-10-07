
package eva2_13_numeros_pares;

import java.util.Scanner;


public class EVA2_13_NUMEROS_PARES {


    public static void main(String[] args) {
        //NUMEROS PARES 
        //EL USUARIO TIENE QUE INTRODUCIR UN NUMERO PAR
        //SCANNER
        Scanner input = new Scanner(System.in);
        //INICIALIZACION DE VARIABLES
        int num, num1;
        //EJECUCIÓN DE PROBLEMAS
        System.out.println("Introduce un numero (menor): ");
        num = input.nextInt();
        System.out.println("Introduce otro numero(mayor); ");
        num1 = input.nextInt();
        //inicializacion del for
        for(int indice = num; indice <= num1; indice++){
            int resi = indice % 2;
            if(resi == 0){
                System.out.print(indice + " - ");
            }
        }
                
               
    }
    
}
