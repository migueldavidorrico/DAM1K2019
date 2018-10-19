/*7. Programa que lea dos números por teclado y muestre
el resultado de la división del primero por el segundo.
Se debe comprobar que el divisor no puede ser cero. */
import javax.swing.*;

public class Division {
    public static void main(String[] args){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        int divisor=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para dividir el primer número:"));
        if(divisor!=0){
            double division=numero/(double)divisor;
//            int division=numero/divisor;
            String salida="La división de "+numero+" / "+divisor+" es ";
            salida+=String.format("%.2f",division);
            JOptionPane.showMessageDialog(null,salida);
        }else{
            JOptionPane.showMessageDialog(null,"No se puede hacer la división ya que el divisor es 0");
        }
    }
}