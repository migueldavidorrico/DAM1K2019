import javax.swing.*;

public class piramide
{
    public static void main(String[] args) {
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
        int contador=0;
        String salida="";
        do{
            salida=salida+contador;
            salida+="\n";
            contador++;
        }while(contador<=altura);
        JOptionPane.showMessageDialog(null,salida);
    }
}
