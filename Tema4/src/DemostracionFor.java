import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class DemostracionFor {
    public static void main(String[] args) {
        //Uso del for
        //Tiene tres partes: incialización comprobación y actualización

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        //Cómo se usa el for en 1ºK 2018 2019
        //Se utiliza cuando antes de entrar en el bucle sabemos el número de
        //iteraciones (vueltas) que vamos a hacer
        //Se utiliza: for(int contador;contador<=limite;i++)
        //contador se llama i, j, k ...
        //contador no se cambia en el bucle
        //Excepciones: Para ir cuenta atras
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
        //Excepcion muy rara: Cuando dos variables están muy relacionadas
        for(int i=0, j=10;i<10;i++,j--){
            System.out.println(i + " " + j);
        }
        //Podemos saber las vueltas aunque no sea un número fijo
        int numeroVueltas=Integer.parseInt(JOptionPane.showInputDialog("Número final"));
        for(int i=0;i<=numeroVueltas;i++){
            System.out.println(i);
        }


        //Bucle infinito:
//        for(;;){
//            System.out.println("ruur");
//        }
        //Otro bucle infinito
//        while(true){
//            System.out.println("gjk");
//        }
        //Ejemplo bucles anidados: Cuadrado de asteriscos
//        ****
//        ****
//        ****
//        ****
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");

        int lado=Integer.parseInt(JOptionPane.showInputDialog("Lado?"));
        for(int i=0;i<lado;i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
