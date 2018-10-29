import javax.swing.*;

public class PruebaTabla {
    public static void main(String[] args) {
        //int numeroFinal=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número final de la tabla"));
        for (int i = 10; i <= 100 ; i+=5) {

            Tabla tabla=new Tabla(i);
            System.out.println(tabla.cadenaTabla());
            JOptionPane.showMessageDialog(null,tabla.cadenaHTMLTabla(),"Tabla hasta el "+i,JOptionPane.PLAIN_MESSAGE);
        }
    }
}
