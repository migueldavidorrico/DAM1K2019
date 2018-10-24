//MEJORAMOS LA NO TA DEL EJERCICIO BREAKYCONTINUE
import javax.swing.*;


public class BreakyContinueConStrings {
    public static final int NUMEROS_PEDIDOS = 10;
    private static final int NUMERO_MARAVILLOSO = -17;
    private static final String SEPARADOR_LINEA = "\n";
    private static final String CADENA_ENCONTRADO = "EUREKA"+SEPARADOR_LINEA;

    public static void main(String[] args) {
        //leer 10 números
        //si se pone un cero, parar del todo
        //Si el número es par, no hacer nada
        //Si el numero es impar, decirlo
        // si el número es negativo e impar,
        //imprimir el doble, imprimir el triple
        //imprimir el cuadrado y si es el -17, imprimir "EUREKA"

        for (int i = 0; i < 10; i++) {
            int numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Numero a analizar?"));
            if(numeroIntroducido==0){
                break;
            }
            if (numeroIntroducido % 2 == 0) {
                continue;
            }
            System.out.println("Es impar");
            if (numeroIntroducido < 0) {
                System.out.println(numeroIntroducido * 2);
                System.out.println(numeroIntroducido * 3);
                System.out.println(numeroIntroducido * numeroIntroducido);
                if (numeroIntroducido == -17) {
                    System.out.println("EUREKA");
                }
            }


      }



//        int vueltaActual=1;
//        int numeroIntroducido;
//        do{
//
//            String salida="";
//            numeroIntroducido= Integer.parseInt(JOptionPane.showInputDialog("Numero a analizar?"));
//            if(numeroIntroducido!=0) {
//                if (numeroIntroducido % 2 != 0) {
//                    salida += "Es impar" + SEPARADOR_LINEA;
//                    if (numeroIntroducido < 0) {
//                        salida += numeroIntroducido * 2 + SEPARADOR_LINEA;
//                        salida += numeroIntroducido * 3 + SEPARADOR_LINEA;
//                        salida += numeroIntroducido * numeroIntroducido + SEPARADOR_LINEA;
//                        if (numeroIntroducido == NUMERO_MARAVILLOSO) {
//                            salida += CADENA_ENCONTRADO;
//                        }
//                    }
//                    JOptionPane.showMessageDialog(null, salida);
//                }
//            }
//        } while(numeroIntroducido!=0 && (vueltaActual++)<NUMEROS_PEDIDOS);
//

//
//        for (int i = 0; i < NUMEROS_PEDIDOS; i++) {
//            String salida="";
//            numeroIntroducido= Integer.parseInt(JOptionPane.showInputDialog("Numero a analizar?"));
//
//            if(numeroIntroducido%2!=0) {
//                salida+="Es impar"+SEPARADOR_LINEA;
//                if(numeroIntroducido<0){
//                    salida+=numeroIntroducido * 2+SEPARADOR_LINEA;
//                    salida+=numeroIntroducido * 3+SEPARADOR_LINEA;
//                    salida+=numeroIntroducido * numeroIntroducido+SEPARADOR_LINEA;
//                    if(numeroIntroducido==NUMERO_MARAVILLOSO){
//                        salida+=CADENA_ENCONTRADO;
//                    }
//                }
//                JOptionPane.showMessageDialog(null,salida);
//            }
//        }
//
    }
}
