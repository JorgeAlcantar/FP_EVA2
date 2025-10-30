
package eva2_34_primo;

import java.util.Scanner;


public class EVA2_34_PRIMO {


    public static void main(String[] args) {
        // DECISIÓN DE NÚMEROS PRIMOS
        //Scanner
        Scanner input = new Scanner(System.in);
        //Variables
        int numero;
        double elección;
        //Imprimir
        System.out.println("ENTRAR AL PROGRAMA DE VERIFICACIÓN DE NÚMEROS PRIMOS: SI (CUALQUIER NÚMERO) NO (0)");
        elección = input.nextDouble();
        while(elección != 0){
        System.out.println("*** DECISOR DE NÚMEROS PRIMOS ***");
        System.out.print("Introduce un número: ");
        numero = input.nextInt();
        
        boolean valor = true; // asumimos que es primo al inicio
        
        if (numero <= 1) {
            valor = false; // los números menores o iguales a 1 no son primos
        } else {
            // ciclo para verificar divisores
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    valor = false; // si se encuentra un divisor, no es primo
                    break; // se detiene el ciclo porque ya no es necesario continuar
                }
            }
        }
        
        // resultado final
        if (valor) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }
        }
    }
    
}
