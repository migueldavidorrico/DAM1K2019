import javax.swing.*;

public class Ejercicio4Tema3 {

    public static void main(String[] args) {
        String celda=JOptionPane.showInputDialog("Introduce cadena");
        JOptionPane.showMessageDialog(null,celda+celda+celda+celda+'\n'
                +celda+celda+celda+celda+'\n'
                +celda+celda+celda+celda+'\n'
                +celda+celda+celda+celda+'\n');
    }
}

