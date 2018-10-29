import javax.swing.*;

//Leer numéros hasta que se introduzca un número mayor que 20
public class LeerMenoresDe20 {
    public static void main(String[] args) {
        int numeroLeido=Integer.parseInt(JOptionPane.showInputDialog("Número?"));
        while(numeroLeido<=20){
            JOptionPane.showMessageDialog(null,numeroLeido);
            numeroLeido=Integer.parseInt(JOptionPane.showInputDialog("Número?"));
        }
    }
}
