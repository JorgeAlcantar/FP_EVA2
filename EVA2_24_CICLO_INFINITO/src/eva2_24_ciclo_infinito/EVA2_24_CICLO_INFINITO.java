
package eva2_24_ciclo_infinito;

import java.util.Scanner;


public class EVA2_24_CICLO_INFINITO {
    
    final static String USUARIO = "WILLIAM";
    final static String PASSWORD = "1987";
    public static void main(String[] args) {
        //VARIABLE Y SCANNER
        Scanner input = new Scanner(System.in);
        String usu, contra;
        //INICIO DEL PROGRAMA
        while(true){
            System.out.println("ACCESO DEL SISTEMA------");
            System.out.print("Usuario: ");
            usu = input.nextLine();
            System.out.print("Contraseña: ");
            contra = input.nextLine();
            if(usu.equals(USUARIO) && contra.equals(PASSWORD)){
                break;
            
            }
        }
        System.out.println("BIENVENIDO AL SISTEMA!!");
        
    }
    
}
