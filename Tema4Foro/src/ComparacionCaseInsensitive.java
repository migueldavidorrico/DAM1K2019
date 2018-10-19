import javax.swing.*;

public class ComparacionCaseInsensitive {
    public static void main(String[] args)
    {
        String primeroASaber;
        String segundoASaber;

        primeroASaber= JOptionPane.showInputDialog(null,"Introduce el primer carácter");
        segundoASaber= JOptionPane.showInputDialog(null,"Introduce el segundo carácter");
//        if(primeroASaber.toUpperCase().equals(segundoASaber.toUpperCase())){
        String primeroMayusculas=primeroASaber.toUpperCase();
        String segundoMayusculas=segundoASaber.toUpperCase();

        if(primeroMayusculas.equals(segundoMayusculas))
        {
            JOptionPane.showMessageDialog(null,"Las dos cadenas son la misma");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Las dos cadenas son distintas");
        }

    }
}
