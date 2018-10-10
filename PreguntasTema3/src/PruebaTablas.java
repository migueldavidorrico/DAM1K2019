import javax.swing.*;


public class PruebaTablas {
    public static void main(String[] args) {
        //Lectura de un char
//        char caracter;
//        caracter = JOptionPane.showInputDialog("(l) EN LETRAS, (n) SÍMBOLOS").charAt(0);


//      System.out.println("El carácter introducido es: " + caracter);  Tabla.setSimbolo(" por ");
//        Tabla.setIgual(" es igual a ");

        Tabla.ponteEnLetras();
        int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog("¿Número?"));

        Tabla tabla = new Tabla(numeroPedido);
        System.out.println(tabla.cadenaTabla());
        JOptionPane.showMessageDialog(null, tabla.cadenaTabla());
        tabla.setNumero(4);
        Tabla.setSimbolo("x");
        Tabla.ponteEnSimbolos();
        System.out.println(tabla.cadenaTabla());

    }
}
