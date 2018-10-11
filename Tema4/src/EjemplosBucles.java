import javax.swing.*;

public class EjemplosBucles {
    public static void main(String[] args) {
        int numero=1;
        while(numero<10){
            System.out.println("Numero: " + numero);
            numero++;
        }

        do{
            numero--;
            System.out.println("Numero: " + numero);
            JOptionPane.showMessageDialog(null,"Numero: "+numero);
        } while(numero>0);

        //Pedir un número que esté entre el 1 y el 10
        int numeroLeido;
        boolean numeroEsValido;
        do{
            numeroLeido= Integer.parseInt(JOptionPane.showInputDialog("Número entre 1 y 10"));
            numeroEsValido=numeroLeido>=1 && numeroLeido<=10;
            if(!numeroEsValido){
                JOptionPane.showMessageDialog(null,"Número no válido");
            }
        } while(!numeroEsValido);
        JOptionPane.showMessageDialog(null,"Has introducido el "+numeroLeido);

    }
}
