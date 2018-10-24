import javax.swing.*;

public class EjemplosFor {
    public static void main(String[] args) {
        //int vueltas= Integer.parseInt(JOptionPane.showInputDialog("Nuúmero final"));
    int vueltas=6;
        for(int i=0;i<vueltas;i++){
            System.out.println(i);
        }

        //Leer 6 números y decir cunatos de estos son múltiplos de 3 (Contador)
        int multiplos3=0;
        for (int i = 0; i < 6; i++) {
            int numeroIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Numero?"));
            if(numeroIntroducido%3==0){
                multiplos3++;
           }
        }
        System.out.println("Hay " + multiplos3 + " múltiplos de 3");

        //Leer 5 números y calcular su suma (Acumulador)
        int suma=0;
        for(int i=0;i<5;i++){
            int numeroIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Número: "+(i+1)));
            suma+=numeroIntroducido;
        }

        System.out.println(suma);


    }
}
