import javax.rmi.CORBA.Tie;
import javax.swing.*;

public class Tienda {
    public static String nombreCadena="EROSKI";

    public static void setNombreCadena(String nuevoNombre){
        Tienda.nombreCadena=nuevoNombre;
    }
    public static void duplicaNombre(){
        Tienda.nombreCadena=Tienda.nombreCadena+Tienda.nombreCadena;
    }

    public static void imprimeEslogan(){
        for (int i = 0; i < 100; i++) {
            System.out.println(nombreCadena + " ES LO MEJOR");
        }
    }

    public static void main(String[] args) {
        Tienda.duplicaNombre();
        Tienda.duplicaNombre();
        Tienda.duplicaNombre();
        Tienda.imprimeEslogan();
        JOptionPane.showMessageDialog(null,"Bienvenido a EROSKI");
    }


}
