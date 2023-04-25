package principal;

import view.VentanaMenu;
import view.VentanaRegistroCliente;

public class Main {
    public static void main(String [] args){
        inicializador();
    }

    public static void inicializador(){
        VentanaMenu ventanaMenu = new VentanaMenu();
        ventanaMenu.setVisible(true);
    }
}
