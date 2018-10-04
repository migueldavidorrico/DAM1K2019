import javax.swing.*;

public class MuestraCuadrados {
    public static void main(String[] args) {
        CuadradoTexto cuadradoTexto=new CuadradoTexto("ab");
        System.out.println(cuadradoTexto.cadenaCuadrado());
        cuadradoTexto.setCadenaARepetir("pepe");
        JOptionPane.showMessageDialog(null,cuadradoTexto.cadenaCuadrado());
    }
}
