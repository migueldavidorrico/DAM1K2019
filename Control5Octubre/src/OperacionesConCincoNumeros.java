/*
Hacer un programa que pida cinco números por teclado y muestre su suma y su media. Pegarlo en la respuesta
 */
import javax.swing.*;

public class OperacionesConCincoNumeros {
    public static void main(String[] args) {
        int primerNumero= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primero"));
        int segundoNumero= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo"));
        int tercerNumero= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tercero"));
        int cuartoNumero= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el cuarto"));
        int quintoNumero= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el quinto"));

        int suma=primerNumero+segundoNumero+tercerNumero+cuartoNumero+quintoNumero;
        double media=suma/5.0;
        String salida="La suma de los números es "+suma
                +" y la media es "+String.format("%.2f",media);
        System.out.println(salida);
        JOptionPane.showMessageDialog(null,salida);
    }
}
