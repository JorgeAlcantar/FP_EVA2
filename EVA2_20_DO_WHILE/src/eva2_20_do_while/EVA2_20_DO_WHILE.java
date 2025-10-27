/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author JORGE
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SCANNER
        Scanner input = new Scanner(System.in);
        //VARIAVLE
        int opción;
        //menú
        do{
        System.out.println("MENÚ PRINCIPAL----------");
        System.out.println("Presiona la opción:");
        System.out.println("1. Pedidos");
        System.out.println("2. Proovedores");
        System.out.println("3. Facturación");
        System.out.println("4. Salir");
        opción = input.nextInt();
        
        switch(opción){
            case 1:
                System.out.println("PEDIDOS DEL SISTEMA");
                break;
            case 2:
                System.out.println("PROVEEDORES DEL SISTEMA!!");
                break;
            case 3:
                System.out.println("FACTURACIÓN DEL SISTEMA!!");
                break;
        
        }
        }while(opción != 4);//Mientras opción sea diferente a cuatro 
        System.out.println("FIN DEL PROGRAMA!");
        //PROGRAMA PARA USUARIO Y CONTRASEÑA
        
    
    }
    
}
