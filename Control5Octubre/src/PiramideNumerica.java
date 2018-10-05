import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class PiramideNumerica {
    public static void main(String[] args) {
        int numeroIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        int primero=numeroIntroducido/10000;
        int primeroSegundo=numeroIntroducido/1000;
        int tresPrimeros=numeroIntroducido/100;
        int cuatroNumeros=numeroIntroducido/10;

        System.out.printf("%5s%n",primero);
        System.out.printf("%5s%n",primeroSegundo);
        System.out.printf("%5s%n",tresPrimeros);
        System.out.printf("%5s%n",cuatroNumeros);
        System.out.printf("%5s%n",numeroIntroducido);
    }
}
