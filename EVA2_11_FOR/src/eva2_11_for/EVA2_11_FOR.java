
package eva2_11_for;

import java.util.Scanner;


public class EVA2_11_FOR {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("Mensaje a repetir: ");
        mensaje = input.nextLine();
        System.out.println("Cantidad de repeticiones: ");
        rep = input.nextInt();
        for(int i = 1; i <= rep; i++){
            System.out.println(mensaje);
        
        }
        
    }
    
}
