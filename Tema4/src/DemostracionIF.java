import javax.swing.*;

public class DemostracionIF {
    public static void main(String[] args) {
        int edad=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));

        if(edad>=18) {
            System.out.println("ERES MAYOR DE EDAD");
        } else {
            System.out.println("PQUEÑITO");
        }




        if(edad>=10 && edad<=19){
            System.out.println("TEENAGER");
        } else if(edad>=20 && edad<=40){
            System.out.println("JOVENCILLO");
        } else if(edad>41 && edad<60){
            System.out.println("LA FLOR DE LAVIDA");
        } else {
            System.out.println("NI TE LO DIGO");
        }


        /*

        NO HACER
        boolean mayorDeEdad;
        if(edad>=18){
            mayorDeEdad=true;
        } else {
            mayorDeEdad=false;
        }
         */

        boolean mayorDeEdad=(edad>=18);

        System.out.println("ADIOS");
        /*
        if(booleano){

        }


        if(booleano){

        } else {

        }

        if(booleano){

        } else if(booleano){

        } else if(booleano){

        } ...


         */
    }
}
