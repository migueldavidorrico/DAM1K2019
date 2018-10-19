/*1. Programa Java que lea un número entero y calcule si es par o impar.*/

import javax.swing.*;
public class ParImpar {
    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("¿Numero?"));
        //Javier
        String salida="El número "+numero+" es ";
        if(numero%2==0){
            JOptionPane.showMessageDialog(null,salida+"PAR.");
        }else{
            JOptionPane.showMessageDialog(null,salida+"IMPAR.");
        }
//
//        int ultimaCifra=numero%10;
//        switch(ultimaCifra){
//            case 0:
//            case 2:
//            case 4:
//            case 6:
//            case 8:JOptionPane.showMessageDialog(null,"El número es par");
//            break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 9:JOptionPane.showMessageDialog(null,"El número es impar");
//            default:
//            break;
//        }
//        System.out.println(ultimaCifra);
//        if(ultimaCifra==0
//                || ultimaCifra==2
//                || ultimaCifra==4
//                || ultimaCifra==6
//                || ultimaCifra==8){
//            JOptionPane.showMessageDialog(null,"El número es par");
//        } else {
//            JOptionPane.showMessageDialog(null,"El número es impar");
//        }
//        if(numero%2==0){
//            JOptionPane.showMessageDialog(null,"El número es par");
//        } else{
//            JOptionPane.showMessageDialog(null,"El número es impar");
//        }
        /*Forma natural. Miramos la última cifra, 0 ,2, 4, 6, 8 */


    }
}
