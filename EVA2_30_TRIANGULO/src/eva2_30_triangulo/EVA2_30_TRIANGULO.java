
package eva2_30_triangulo;

import java.util.Scanner;


public class EVA2_30_TRIANGULO {


    public static void main(String[] args) {
        //1. SOLICITE UN VALOR AL USUARIO Y CON ESE VALOR IMPRIMA EL SIGUIENTE PATRÓN USANDO CICLOS.
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
    }
    
}
