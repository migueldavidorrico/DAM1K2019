import javax.swing.*;

public class EsMayuscula {
    public static void main(String[] args) {
        char caracterLeido= JOptionPane.showInputDialog("¿Carácter?").charAt(0);
        String salida="El carácter "+caracterLeido+ " es ";
        if(Character.isUpperCase(caracterLeido)){
            salida+="Mayúsculas";
        } else if(Character.isLowerCase(caracterLeido)){
            salida+="Minúsculas";
        } else {
            salida+="un caracter raro";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
