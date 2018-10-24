import javax.swing.*;

public class BreakyContinue {
    public static final int NUMEROS_PEDIDOS = 10;

    public static void main(String[] args) {
        //leer 10 números
        //si se pone un cero, parar del todo
        //Si el número es par, no hacer nada
        //Si el numero es impar, decirlo
        // si el número es negativo e impar,
        //imprimir el doble, imprimir el triple
        //imprimir el cuadrado y si es el -17, imprimir "EUREKA"

//        for (int i = 0; i < 10; i++) {
//            int numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Numero a analizar?"));
//            if (numeroIntroducido % 2 == 0) {
//                continue;
//            }
//            System.out.println("Es impar");
//            if (numeroIntroducido < 0) {
//                System.out.println(numeroIntroducido * 2);
//                System.out.println(numeroIntroducido * 3);
//                System.out.println(numeroIntroducido * numeroIntroducido);
//                if (numeroIntroducido == -17) {
//                    System.out.println("EUREKA");
//                }
//            }
//
//
//        }
//
        for (int i = 0; i < NUMEROS_PEDIDOS; i++) {
            int numeroIntroducido= Integer.parseInt(JOptionPane.showInputDialog("Numero a analizar?"));

            if(numeroIntroducido%2!=0) {
                System.out.println("Es impar");
                if(numeroIntroducido<0){
                    System.out.println(numeroIntroducido * 2);
                    System.out.println(numeroIntroducido * 3);
                    System.out.println(numeroIntroducido * numeroIntroducido);
                    if(numeroIntroducido==-17){
                        System.out.println("EUREKA");
                    }
                }
            }
        }
    }
}
