import javax.swing.*;

public class CuadradoSimple {
    public static void main(String[] args) {
        String cadena= JOptionPane.showInputDialog("Cadena?");
        String fila=cadena+cadena+cadena+cadena+"\n";
        String cuadrado=fila+fila+fila+fila;
        System.out.println(cuadrado);
    }
}
