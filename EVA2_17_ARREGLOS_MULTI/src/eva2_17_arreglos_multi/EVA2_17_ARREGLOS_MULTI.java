
package eva2_17_arreglos_multi;


public class EVA2_17_ARREGLOS_MULTI {


    public static void main(String[] args) {
        //INICIALIZACION DE VARIABLES
        int matriz[][] = new int[3][4];//CUANTAS FILAS (3), CUANTAS COLUMNAS (4)
        //int cubo[][][] = new int[2][2][2]; [] = son las dimensiones
        //Es necesario especificar la posición del arreglo
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[0][3] = 400;
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
        //IMPRIMIR
        //FOR 
        //CICLOS ANIDADOS: CICLOS DENTRO DE OTRO CICLO
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
    
    }
        
    }

    public EVA2_17_ARREGLOS_MULTI() {
    }
    
}
