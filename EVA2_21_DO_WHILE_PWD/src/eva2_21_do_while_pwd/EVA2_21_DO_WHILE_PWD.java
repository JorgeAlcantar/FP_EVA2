/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_do_while_pwd;

import java.util.Scanner;

/**
 *
 * @author JORGE
 */
public class EVA2_21_DO_WHILE_PWD {

    final static String USUARIO = "WILLIAM";
    final static String PASSWORD = "1987";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usu, contra;
        do{
            System.out.println("ACCESO DEL SISTEMA------");
            System.out.print("Usuario: ");
            usu = input.nextLine();
            System.out.print("Contraseña: ");
            contra = input.nextLine();
            
         
        }while(!(usu.equals(USUARIO) && contra.equals(PASSWORD)));
        System.out.println("BIENVENIDO AL SISTEMA!!");
        
    }
    
}
