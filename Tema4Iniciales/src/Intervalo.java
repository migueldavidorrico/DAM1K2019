import javax.swing.*;

public class Intervalo {
    public static final int LIM_INF=10;
    public static final int LIM_SUP=20;

    public static void main(String[] args) {
        int numeroIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Numero?"));
        if(numeroIntroducido>=LIM_INF && numeroIntroducido<=LIM_SUP){
            JOptionPane.showMessageDialog(null,"Está en el intervalo");
        } else {
            JOptionPane.showMessageDialog(null,"No está en el intervalo");
        }
    }
}
