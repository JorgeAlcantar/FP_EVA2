
package eva2_34_primo;

import java.util.Scanner;


public class EVA2_34_PRIMO {


    public static void main(String[] args) {
        // DECISIÓN DE NÚMEROS PRIMOS
        //Scanner
        Scanner input = new Scanner(System.in);
        //Variables
        double numero, elección;
        //Imprimir
        System.out.println("ENTRAR AL PROGRAMA DE VERIFICACIÓN DE NÚMEROS PRIMOS: SI (CUALQUIER NÚMERO) NO (0)");
        elección = input.nextDouble();
        while(elección != 0){
        System.out.println("*** DECISOR DE NÚMEROS PRIMOS ***");
        System.out.print("Introduce un número para verificar que sea número primo o no: ");
        //Solicitar datos
        numero = input.nextDouble();
        //VARIABLE DE RESIDUO
        double resi, resi2;
        //Cálculo
        resi = numero % 1;
        resi2 = numero % numero;
        if(resi == 0 && resi2 == 0){
            System.out.println("ES NÚMERO PRIMO.");
            int eleccion2;
            System.out.println("¿DESEA CONTINUAR? SI (CUALQUIER NUMERO) NO(0)");
            eleccion2 = input.nextInt();
            if(eleccion2 == 0){
                System.out.println("FIN DEL PROGRAMA");
                break;
            }
        }else{
            System.out.println("NO ES NÚMERO PRIMO");
            System.out.println("¿DESEA CONTINUAR? SI (CUALQUIER NUMERO) NO(0)");
            int eleccion3 = input.nextInt();
            if(eleccion3 == 0){
                System.out.println("FIN DEL PROGRAMA");
                break;
            }
        }
        
        }
      
    }
    
}
