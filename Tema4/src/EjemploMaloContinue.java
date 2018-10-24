import javax.swing.*;

//Contar pares e impares hasta un negativo
public class EjemploMaloContinue {
    //Bandera Variable booleana que
    // tiene un valor y solo una vez se cambia ese valor
    public static void main(String[] args) {
        boolean seguirPidiendo = true;
        int contadorPares = 0;
        int contadorImpares = 0;

//        while (true) {
//            int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero?"));
//            if (numero < 0) {
//                break;
//            }
//            if (numero % 2 == 0) {
//                contadorPares++;
//            } else {
//                contadorImpares++;
//            }
//        }
//        int numero;
//        do{
//            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero?"));
//        } while(numero>=0);
//        //
//
//        numero=2347816;
//        while(numero>=0){
//            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero?"));
//        }



        String salida="Hay ";
        salida+=""+contadorPares+" par"+(contadorPares>1?"es":"");
        System.out.println("Hay " + contadorPares + " pares y " + contadorImpares + " impares");
//        while(seguirPidiendo){
//            int numero=Integer.parseInt(JOptionPane.showInputDialog("Numero?"));
//            if(numero<0){
//                seguirPidiendo=false;
//                //continue;
//            } else {
//                if(numero%2==0){
//                    contadorPares++;
//                } else {
//                    contadorImpares++;
//                }
//
//            }
//        }

    }
}
