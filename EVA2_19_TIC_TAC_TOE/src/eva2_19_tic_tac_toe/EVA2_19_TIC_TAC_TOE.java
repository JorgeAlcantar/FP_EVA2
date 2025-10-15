
package eva2_19_tic_tac_toe;

import java.util.Scanner;


public class EVA2_19_TIC_TAC_TOE {


    public static void main(String[] args) {
        //JUEGO DEL GATO (TIC TAC TOE)
        int tictac[][] = new int [3][3];
        Scanner input = new Scanner(System.in);
        int fila, col, jug;
        //FOR
        for (int i = 0; i < 10; i++){
            System.out.println("INTRODUCE TU JUGADA (FILA): ");
            fila = input.nextInt();
            System.out.println("INTRODUCE TU JUGADA (COLUMNA): ");
            col = input.nextInt();
            System.out.println("jugador (1 o 2)");
            jug = input.nextInt();
        
            tictac[fila][col] = jug;
            for(int j = 0; j < tictac[i].length; j++){
                System.out.print("[" + tictac[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
