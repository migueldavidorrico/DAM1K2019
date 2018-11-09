import javax.swing.*;
import java.util.Scanner;

public class CortaLarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroPalabras;
        int cuentaDeCaracteres = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        String cadena = "";
        String palabraLarga = "";
        String palabraCorta = "";
        String salida = "";
        numeroPalabras =
                Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de palabras:"));
        for (int i = 1; i <= numeroPalabras; i++) {
//System.out.print("Palabra " + i + ": ");
//cadena = sc.nextLine();
            cadena = JOptionPane.showInputDialog(null, "Palabra " + i
                    + ": ");
            cuentaDeCaracteres = cadena.length();
            if (cuentaDeCaracteres > maximo) {
                maximo = cuentaDeCaracteres;
                palabraLarga = cadena;
            }
            if (cuentaDeCaracteres < minimo) {
                minimo = cuentaDeCaracteres;
                palabraCorta = cadena;
            }
        }
        System.out.println("\nLa palabra mas larga es " +
                palabraLarga);
        salida = salida + "La palabra mas larga es " + palabraLarga;
        System.out.println("La palabra mas corta es " + palabraCorta);
        salida = salida + "\nLa palabra mas corta es " + palabraCorta;
        JOptionPane.showMessageDialog(null, salida);
    }
}
