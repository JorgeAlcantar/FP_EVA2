
package eva2_12_tabla_mult;

import java.util.Scanner;


public class EVA2_12_TABLA_MULT {


    public static void main(String[] args) {
        // TABLA DE MULTIPLICAR, SE SOLICITA UN MUMERO, IMPRIMA LA TABLA DE MULTIPLICAR
        //SCANNER
        Scanner input = new Scanner(System.in);
        //INICIALIZACIÓN DE VARIABLES
        double num;
        //IMPRIMIR
        System.out.println("***TABLAS DE MULTIPLICACIÓN***");
        System.out.println("INTRODUCE UN NÚMERO QUE DESEAS SABER SU TABLA DE MULTIPLICACIÓN: ");
        //INTRODUCCIÓN DE DATOS
        num = input.nextDouble();
        //INICIALIZACION DEL for
        System.out.println("LA TABLA DE MULTIPLICAR ES: ");
        for(int ind = 1; ind <= 10; ind++){
            System.out.println(num + " * " + ind + " = " + num * ind);
        }
    }
    
}
