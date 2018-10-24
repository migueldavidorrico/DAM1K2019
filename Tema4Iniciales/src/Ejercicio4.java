import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Primer número:");
        int primero=sc.nextInt();
        System.out.print("Segundo número:");
        int segundo=sc.nextInt();
        int suma=primero+segundo;



        if(suma==0){
            System.out.println("La suma es cero");
        }
        if(suma>0){
            System.out.println("La suma es positiva");
        }
        if(suma<0){
            System.out.println("La suma es negativa");
        }

        //NO SE HACE
        if(suma%3==0){
            System.out.println("Es par");
        }
        if(suma%2!=0){
            System.out.println("Es impar");
        }

//        if(suma==0){
//            System.out.println("La suma es cero");
//        } else {
//            if(suma>0){
//                System.out.println("La suma es positiva");
//            } else {
//                System.out.println("La suma es negativa");
//            }
//        }
    }
}
