
package eva2_33_cuenta;

import java.util.Scanner;


public class EVA2_33_CUENTA {


    public static void main(String[] args) {
        //4. CUENTA BANCARIA
        //SCANNER
        Scanner input = new Scanner(System.in);
        //VARIABLES
        double cuenta = 1000000, retiro;
        int elección;
        //IMPRIMIR
        System.out.println("*** BBVA ***");
        System.out.println("ENTRAR A LA CUENTA A RETIRAR DINERO: SI (1) o NO (0)");
        elección = input.nextInt();
        while(elección != 0){
            System.out.println("¿CUANTO DINERO DESEA RETIRAR?");
            retiro = input.nextDouble();
            cuenta -= retiro;
            System.out.println("El dinero con el que cuenta es de: " + "$" + cuenta);
            System.out.println("");
            if (cuenta < 0){
                System.out.println("FONDOS INSUFICIENTES");
                System.out.println("SU MONTO ACTUAL ES: " + "$" + cuenta);
                break;
            }else if(cuenta == 0){
                System.out.println("YA NO PUEDE REALIZAR MÁS RETIROS");
                break;
            }
        }

    }
    
}
