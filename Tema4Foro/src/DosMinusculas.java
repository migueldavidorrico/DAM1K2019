import javax.swing.*;

public class DosMinusculas {
    public static void main(String[] args) {
        char primerCaracter;
        char segundoCaracter;
        primerCaracter = JOptionPane.showInputDialog("Introduce el primer caracter").charAt(0);
        segundoCaracter = JOptionPane.showInputDialog("Introduce el segundo caracter").charAt(0);
        String salida="El primer caracter está en ";
        salida+=Character.isLowerCase(primerCaracter)?"minúsculas":"MAYÚSCULAS";
        salida+=". El segundo caracter está en ";
        salida+=Character.isLowerCase(segundoCaracter)?"minúsculas":"MAYÚSCULAS";
        System.out.println(salida);

//        if (Character.isLowerCase(primerCaracter) && Character.isLowerCase(segundoCaracter)) {
//            JOptionPane.showMessageDialog(null, "Las dos letras son minusculas");
//        }else if (Character.isLowerCase(primerCaracter)) {
//            JOptionPane.showMessageDialog(null, "La primera letra es minuscula ");
//        } else if(Character.isLowerCase(segundoCaracter)){
//            JOptionPane.showMessageDialog(null, "La segunda letra es minuscula");
//        }else{
//            JOptionPane.showMessageDialog(null,"Ninguna de las dos es minuscula");
//        }
    }
}
