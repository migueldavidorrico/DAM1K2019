import javax.swing.*;

public class ListaYMediaNumerosNaturales {
    public static int entradaNumeroFinal(){
        return Integer.parseInt(JOptionPane.showInputDialog("Numero Final?:"));
        //return 30;
    }

    public static String listaNumeros(int primero, int ultimo){
        String salida="";
        for (int i = primero; i <= ultimo; i++) {
            salida+=i;
            if(i!=ultimo){
                salida+=", ";
            } else {
                salida+="-FIN";
            }
        }
        return salida;
    }
    public static void main(String[] args) {
        //Entrada de datos
        int numeroInicial=entradaNumeroInicial();
        int numeroFinal=entradaNumeroFinal();

        System.out.println("Vamos a contar hasta el "+numeroFinal);
        //Obtener La lista
        String salidaLista=listaNumeros(numeroInicial,numeroFinal);
        System.out.println(salidaLista);
        // Obtener la media
        double mediaNumeros=media(numeroInicial,numeroFinal);
        System.out.println(mediaNumeros);
        // Mostrar salida
        JOptionPane.showMessageDialog(null,"Los números son:\n"
                +salidaLista
                +"\n"+
                String.format("%.2f",mediaNumeros));
    }

    private static int entradaNumeroInicial() {
        return Integer.parseInt(JOptionPane.showInputDialog("Numero Inicial?:"));
    }

    private static double media(int primero, int ultimo) {
        int suma=0;
        for (int i = primero; i <=ultimo ; i++) {
            suma+=i;
        }

        return suma/(double)(ultimo-primero+1);
    }
}
