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


        System.out.println(ejemplo.contains("un"));
        String ejemploHTML="<h1>Hola</h1><p>Este paparrucha <pre>pilar papas texto es HTML</p><p>Segundo párrafo</p>";

        int numeroP=0;
        int posicion=0;
        while(ejemploHTML.indexOf("<p>",posicion)!=-1){
            numeroP++;
            posicion=ejemploHTML.indexOf("<p>",posicion)+1;
        }
        System.out.println("Hay " + numeroP + " <p>");
        //Ejercicio: Separar el nombre de un fichero en nombre y extensión

        String nombreFichero="miguel.orrico.primerok.gif";
        String nombre;
        String extension;
        nombre=nombreFichero.substring(0,nombreFichero.lastIndexOf('.'));
        extension=nombreFichero.substring(nombreFichero.lastIndexOf('.')+1,nombreFichero.length());

        System.out.println("El nombre del fichero es "+nombre+" y la extension es "+extension);
        System.out.println(ejemploHTML);
        System.out.println(ejemploHTML.replace("<", "&lt;"));
        System.out.print("|");
        System.out.print("      kjvcsdnl      ".trim());
        System.out.println("|");

    }
}
