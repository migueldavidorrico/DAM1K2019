import javax.swing.*;

public class ESTrabajador {
    public static Trabajador pedirTRabajadorPorTeclado() {
        Trabajador salida;
        String nombre= JOptionPane.showInputDialog("Nombre?");
        String sueldoIntroducido=JOptionPane.showInputDialog(null,"Sueldo?");
        if(sueldoIntroducido.length()==0){
            return new Trabajador(nombre);
        }
        int sueldo=Integer.parseInt(sueldoIntroducido);
        salida=new Trabajador(nombre,sueldo);
        return salida;
    }
}
