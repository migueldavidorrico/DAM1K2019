import javax.swing.*;

/*Hacer un programa que pida la edad del usuario y muestre
el número de años que faltan para jubilarse (a los 65 años)
 */
public class TiempoTrabajar {
    private static final int EDAD_JUBILACION = 65;

    public static void main(String[] args) {
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
        int anyosParaJubilarse=EDAD_JUBILACION-edad;
        System.out.println("Te faltan " + anyosParaJubilarse + " años para jubilarte");
    }
}
