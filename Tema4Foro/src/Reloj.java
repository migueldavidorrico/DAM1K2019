import javax.swing.*;

public class Reloj {
    public static void main(String[] args){


        String salida="";
        boolean respuestaValida=false;
        do {
            int H = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para la hora: "));
            if(H>=0 && H<=11){

                salida += H + ":";
                respuestaValida=true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "RESPUESTA INCORRECTA",
                        "ERROR 404",
                        JOptionPane.WARNING_MESSAGE);
            }
        } while(!respuestaValida);

        //EJERCICIO PARA EL LUNES. REPETIR ESTA ESTRUCTURA EN MINUTOS Y SEGUNDOS

        int M=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para los minutos: "));
        if(M<10){
            salida+="0";
        }
        salida+=M+":";


        int S=Integer.parseInt(JOptionPane.showInputDialog("Intrduce un valor para los segundos: "));
        if(S<10){
                salida+="0";
            }
            salida+=S;
            JOptionPane.showMessageDialog(null,salida);
    }
}
