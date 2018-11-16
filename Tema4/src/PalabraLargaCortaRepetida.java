/*
Longitud de la palabra más larga (pueden ser varias)
 */

import javax.swing.*;

public class PalabraLargaCortaRepetida {
    public static void main(String[] args) {

        int longituMaxima=0;
        String palabrasMaximas="";
        String palabraActual="";
        while(!"FIN".equalsIgnoreCase(palabraActual)){
            if(palabraActual.length()>longituMaxima){
                longituMaxima=palabraActual.length();
                palabrasMaximas=palabraActual+", ";
            } else if(palabraActual.length()==longituMaxima){
                palabrasMaximas+=palabraActual+", ";
            }
            palabraActual=JOptionPane.showInputDialog("Palabra:");

        }
        palabrasMaximas=palabrasMaximas.substring(0,palabrasMaximas.length()-2);
        System.out.println(palabrasMaximas + " tiene (n) " + longituMaxima + " caracteres");
    }
}
