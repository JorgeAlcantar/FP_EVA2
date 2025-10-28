
package eva2_28_buscar;

import java.util.Scanner;


public class EVA2_28_BUSCAR {


    public static void main(String[] args) {
        //BUSCAR
        int valores[] = new int[10];
        Scanner input = new Scanner(System.in);
        int valor;
        for(int i = 0; i < valores.length; i++){
            valores[i] = (int)(Math.random() * 100);
        
        }
        for(int i = 0; i < valores.length; i++){
            System.out.print("[" + valores[i] + "]");
        
        }
        System.out.println("VALOR A BUSCAR: ");
        valor = input.nextInt();
        for(int i = 0; i < valores.length; i++){
            if(valor == valores[i]){
                System.out.println("VALOR ENCONTRADO");
                System.out.println("Posición; " + i);
                break;
            }
        }
    }
    
}
