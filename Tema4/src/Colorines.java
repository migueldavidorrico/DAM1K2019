import javax.swing.*;

public class Colorines {
    public static void main(String[] args) {
        String salida="";
        int numeroActual=9;
        salida+="<html><h1>Números</h1><br>";
        while(numeroActual>0){
            salida+="<h1 style=\"color:#"+numeroActual+numeroActual+"FF00\">"+numeroActual+"</h1>";
            numeroActual--;
        }

        salida+="</html>";
        JOptionPane.showMessageDialog(null,salida);

        salida+="<html><h1>Números</h1><br>";
        int numeroActual2=9;
        do{
            salida+="<h1 style=\"color:#"+numeroActual+numeroActual+"FF00\">"+numeroActual+"</h1>";
            numeroActual2--;
        } while (numeroActual2>0);
        salida+="</html>";
        JOptionPane.showMessageDialog(null,salida);
    }
}
