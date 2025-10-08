
package eva2_14_arreglos_for;


public class EVA2_14_ARREGLOS_FOR {


    public static void main(String[] args) {
        
        //ARREGLO
        int arreglo[] = new int[10];
        System.out.println(arreglo.length);
        
        //FOR
        for(int i = 0; i < arreglo.length; i++){//SE UTIIZA EL TAMAÑO DEL ARREGLO PARA EL FOR Y SE COLOCA <
            arreglo[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i < arreglo.length; i++){//SE UTIIZA EL TAMAÑO DEL ARREGLO PARA EL FOR Y SE COLOCA <
            System.out.print("[" + arreglo[i] + "]");
            
        }
    }
    
}
