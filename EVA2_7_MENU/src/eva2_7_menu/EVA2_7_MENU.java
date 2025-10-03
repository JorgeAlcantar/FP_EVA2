
package eva2_7_menu;


public class EVA2_7_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MENU
        //ALITAS = 0, PIZZA = 1, HAMBURGUESA = 2
        String platillos[] = {"Alitas", "Pizza", "Hamburguesa"};
        //PRECIOS
        double precios[] = {250.0, 100, 200};
        //IMPRIMIR
        System.out.println(">>>>>MENÚ<<<<<<");
        System.out.println("0 - " + platillos[0] + " $" + precios[0]);
        System.out.println("1 - " + platillos[1] + " $" + precios[1]);
        System.out.println("2 - " + platillos[2] + " $" + precios[2]);
    }
    
}
