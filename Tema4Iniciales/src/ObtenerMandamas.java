import javax.swing.*;

//Ejercicio para casa, hacerlo para el mínimo
public class ObtenerMandamas {
    public static void main(String[] args) {
        int sueldoMaximo=Integer.MIN_VALUE;
        String nombreMaximo="";
        String nombreTecleado= JOptionPane.showInputDialog("Nombre?");
        int sueldoTecleado=Integer.parseInt(JOptionPane.showInputDialog("Sueldo?"));
        while(sueldoTecleado>0){
            if(sueldoTecleado>sueldoMaximo){
                sueldoMaximo=sueldoTecleado;
                nombreMaximo=nombreTecleado;
            }
            nombreTecleado= JOptionPane.showInputDialog("Nombre?");
            sueldoTecleado=Integer.parseInt(JOptionPane.showInputDialog("Sueldo?"));
        }
        JOptionPane.showMessageDialog(null,nombreMaximo+" es el mandamás, cobrando "+sueldoMaximo);

    }
}
