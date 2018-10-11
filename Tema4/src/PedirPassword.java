/*
Programa que pide usuario y carácter de contraseña hasta
Ana --> 'R'
Bea --> 'e'
 */

import javax.swing.*;

public class PedirPassword {
    public static void main(String[] args) {
        boolean loginCorrecto=false;
        int numeroIntentos=0;
        while(!loginCorrecto && numeroIntentos<3){
                String nombre= JOptionPane.showInputDialog("¿Nombre?");
                String password=JOptionPane.showInputDialog("Contraseña");
                if(nombre.equals("Ana") && password.equals("1234")){
                    loginCorrecto=true;
                }
                if(nombre.equals("Bea") && password.equals("4321")){
                    loginCorrecto=true;
                }
                numeroIntentos++;
        }
        if(loginCorrecto) {
            System.out.println("Estás en el sistema");
        } else {
            System.out.println("No has entrado");
        }
    }
}
