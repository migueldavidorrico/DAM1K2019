/*8. Calcular el mayor de tres números enteros en Java.*/
import javax.swing.*;

public class ElMayorNumero {
    public static void main(String[] args){
        int numeroUno=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para el primer número:"));
        int numeroDos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para el segundo número:"));
        int numeroTres=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para el tercer número:"));

        int maximo=Math.max(Math.max(numeroUno,numeroDos),numeroTres);

//        int maxUnoDos;
//        if(numeroUno>numeroDos){
//            maxUnoDos=numeroUno;
//        } else {
//            maxUnoDos=numeroDos;
//        }
//
//        int maximo;
//        if(maxUnoDos>numeroTres){
//            maximo=maxUnoDos;
//        } else {
//            maximo=numeroTres;
//        }

//
//        if(numeroUno>numeroDos){
//            if(numeroUno>numeroTres){
//                JOptionPane.showMessageDialog(null,"El número mayor es "+numeroUno);
//            }else{
//                JOptionPane.showMessageDialog(null,"El número mayor es "+numeroTres);
//            }
//        }else{
//            if(numeroDos>numeroTres){
//                JOptionPane.showMessageDialog(null,"El número mayor es "+numeroDos);
//            }else{
//                JOptionPane.showMessageDialog(null,"El número mayor es "+numeroTres);
//            }
//        }

    }
}
