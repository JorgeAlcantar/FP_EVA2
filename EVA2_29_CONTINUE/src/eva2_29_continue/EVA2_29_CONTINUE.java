
package eva2_29_continue;


public class EVA2_29_CONTINUE {


    public static void main(String[] args) {
        //CONTINUE --- detiene la repetición actual
        //IMPRIMIR NÚMEROS PARES
        for(int i = 0; i < 100; i++){
            int resi = i % 2;
            if(resi != 0)
                continue;//DETIENE EL PROGRAMA
            System.out.print(i + " - ");
        
        }
    }
    
}
