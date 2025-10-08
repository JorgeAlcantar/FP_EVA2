
package eva2_15_captura_datos;

import java.util.Scanner;


public class EVA2_15_CAPTURA_DATOS {


    public static void main(String[] args) {
        //CAPTURA DE DATOS
        Scanner input = new Scanner(System.in);
        //VARIABLES
        int cali;
        //IMPRIMIR
        System.out.println("Introduce el número de calificaciones que se desea capturar: ");
        cali = input.nextInt();
        //INTRODUCCION DEL ARREGLO 
        int califa[] = new int[cali];
        //FOR
        //CAPTURA
        for(int i = 0; i < califa.length; i++){
        System.out.println("Calificación #" + (i + 1) + ":");
        califa[i] = input.nextInt();
        }
        //ESTE SIRVE PARA IMPRIMIR TEXTO (LECTURA)
        for(int i = 0; i < califa.length; i++){
        System.out.print("[" + califa[i] + "]");
        }
        System.out.println("");
        //PROMEDIO DEL GRUPO
        //SUMAR LAS CALIFICACIONES
        int sumaCalifa = 0;
        //FOR
        for(int i = 0; i < califa.length; i++){
            sumaCalifa += califa[i];
        
        }
        System.out.println("Acumulado = " + sumaCalifa);
        double promedio = sumaCalifa / (double)cali;
        System.out.println("Promedio del Grupo = " + promedio);
        
    }
    
}
