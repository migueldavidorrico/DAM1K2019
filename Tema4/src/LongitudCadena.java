import javax.swing.*;

public class LongitudCadena {
    public static void main(String[] args) {
        String nombreFichero="html perico pepito";

        System.out.println(nombreFichero.length());
        int numeroCaracteresSinEspacios=0;
        for (int i = 0; i < nombreFichero.length(); i++) {
            if(nombreFichero.charAt(i)!=' '){
                numeroCaracteresSinEspacios++;
            }
        }
        System.out.println(numeroCaracteresSinEspacios);
        boolean esHTML=nombreFichero.endsWith(".html");
        System.out.println(nombreFichero.length());
        for (int i = 0; i < nombreFichero.length(); i++) {
            System.out.println(nombreFichero.charAt(i));
        }

        String frase= JOptionPane.showInputDialog("Frase a convertir");
        String salida="<html><h1 style=\"color:blue\">";

        for (int i = 0; i < frase.length(); i++) {
            char caracterActual=frase.charAt(i);
            if(i%2==0){
                salida+=Character.toUpperCase(caracterActual);
            } else {
                salida+=Character.toLowerCase(caracterActual);
            }
        }

        salida+="</h1></html>";
        JOptionPane.showMessageDialog(null,salida,"MODIFICADA",JOptionPane.PLAIN_MESSAGE);
        //Perico de los palotes PeRiCo dE LoS
    }
}
