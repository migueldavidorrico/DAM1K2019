import javax.swing.*;

/*
Leer nombre y adjetivos hasta fin
Juan es listo, joven y rico

 */
public class adjetivos {
    public static void main(String[] args) {

        String nombre= JOptionPane.showInputDialog("Nombre");
        String entrada=JOptionPane.showInputDialog("Adjetivo FIN para terminar");
        String salida=nombre+" es ";
        String ultimo="";
        while(!entrada.equalsIgnoreCase("FIN")){
            if(!ultimo.equals("")){
                salida+=ultimo+", ";
            }
            ultimo=entrada;
            entrada=JOptionPane.showInputDialog("Adjetivo FIN para terminar");
        }
        salida=salida.substring(0,salida.length()-2);
        salida+=" y "+ultimo;
        JOptionPane.showMessageDialog(null,salida);
    }
}
