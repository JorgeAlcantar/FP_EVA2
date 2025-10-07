
package eva2_10_for;

import java.util.Scanner;


public class EVA2_10_FOR {


    public static void main(String[] args) {
        //IMPRIMIR NUMEROS DEL 1 AL 20
        for(int i = 1; i <= 20; i++){
            System.out.print(i + " - ");
        }
        //IMPRIMIR AL REVES
        System.out.println(".");
        for(int indice = 20; indice >= 1; indice--){
            System.out.print(indice + " - ");
        }
        //IMPRIMIR TODOS LOS NUEMROS PARES DEL CERO AL CIEN
        //+=, -=, *=, /=
        System.out.println("");
        for(int i = 0; i <= 100; i += 2){
            System.out.print(i + " - ");
        }
        //IMPRIMIR EN ORDEN INVERSO (100 A 0)
        System.out.println("");
        for(int in = 100; in >= 0; in -= 2){
            System.out.print(in + " - ");
        }
        //SOLICITAR DOS NUMERO AL USUARIO, IMPRIMIR LA LISTA.
        //ENTRE ESOS NUMEROS
        //EN ORDEN INVERSO
        System.out.println("");
        Scanner input = new Scanner(System.in);
        int num, num1, num2, num3;
        System.out.println("Introduce un numero (menor): ");
        num = input.nextInt();
        System.out.println("Introduce otro numero(mayor); ");
        num1 = input.nextInt();
        
        for(int indice = num; indice <= num1; indice++){
            System.out.print(indice + " - ");
        }
        System.out.println("Introduce un numero (mayor): ");
        num2 = input.nextInt();
        System.out.println("Introduce otro numero(menor): ");
        num3 = input.nextInt();
        for(int indice = num1; indice >= num; indice--){
            System.out.print(indice + " - ");
        }
        
    }
    
}
