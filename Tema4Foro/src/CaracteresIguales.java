/*4. Programa que lea dos caracteres por teclado y compruebe si son iguales.*/
import javax.swing.*;

public class CaracteresIguales
{
    public static void main(String[] args)
    {
        char primeroASaber;
        char segundoASaber;

        primeroASaber= JOptionPane.showInputDialog(null,"Introduce el primer carácter").charAt(0);
        segundoASaber= JOptionPane.showInputDialog(null,"Introduce el segundo carácter").charAt(0);
        char primeroMayusculas=Character.toUpperCase(primeroASaber);
        char segundoMayusculas=Character.toUpperCase(segundoASaber);


        System.out.println(primeroASaber);

        if(primeroMayusculas==segundoMayusculas)
        {
            JOptionPane.showMessageDialog(null,"Los dos carácteres son el mismo");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Los carácteres introducidos son distintos");
        }

    }
}
