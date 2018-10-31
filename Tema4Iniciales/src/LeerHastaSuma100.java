import javax.swing.*;

public class LeerHastaSuma100 {
    public static void main(String[] args) {
        int suma=0;
        while(suma<100){
            int entrada= Integer.parseInt(JOptionPane.showInputDialog("Numero?;"));
            suma+=entrada;
            System.out.println(entrada);
        }
        System.out.println(suma);
    }
}
