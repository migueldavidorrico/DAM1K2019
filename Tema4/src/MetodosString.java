import javax.swing.*;

/**Métodos de la clase String más últiles **/
public class MetodosString {
    public static void main(String[] args) {
        String entrada= JOptionPane.showInputDialog("Usuario?");
        if(entrada.equals("user")){
            System.out.println("La contraseña es 0123");
        }


        if("user".equals(entrada)){
            System.out.println("La contraseña es 0123");
        }
        if(entrada.toUpperCase().equals("USER")){
            System.out.println("La contraseña es 0123");
        }

        if(entrada.equalsIgnoreCase("User")){
            System.out.println("La contraseña es 0123");
        }
        String ejemplo="Pablito clavó un clavito";
        System.out.println(ejemplo.substring(2, 5));
        System.out.println(ejemplo.substring(6));

        System.out.println("caracol".compareTo("caracola"));
        System.out.println("niño".compareTo("nito"));


    }
}
