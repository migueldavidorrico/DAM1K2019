import javax.swing.*;
import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tramo;
        int sumaTramos = 0;
        int horas;
        int minutos;
        String cadenaMinutos = "0";
        String salida = "";

        JOptionPane.showMessageDialog(null, "Introduzca las duraciones de sus tramos en minutos (Introduzca un 0 para parar de contar)\n");
        do {
//System.out.print("Duracion tramo: ");
//tramo = sc.nextInt();
            tramo = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Duracion tramo: "));
            sumaTramos = sumaTramos + tramo;
        } while (tramo > 0);
        horas = sumaTramos / 60;
        minutos = sumaTramos % 60;
        if (minutos < 10) {
            cadenaMinutos = cadenaMinutos + minutos;
        } else {
            cadenaMinutos = "" + minutos;
        }

        System.out.println("\nTiempo total de viaje: " + horas +
                ":" + cadenaMinutos + " horas");
        salida = salida + "\nTiempo total de viaje: " + horas +
                ":" + cadenaMinutos + " horas";
        JOptionPane.showMessageDialog(null, salida);

    }
}
