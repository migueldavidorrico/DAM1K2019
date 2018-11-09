import javax.swing.*;

public class TrianguloFloyd {
    private static final int ESPACIOS_NUMEROS = 5;

    public static int pedirNumeroFilas(){
        return Integer.parseInt(JOptionPane.showInputDialog("Numero de Filas?:"));
        //return 5;
    }
    public static void main(String[] args) {
        //Pedir el número de filas
        int numeroFilas=pedirNumeroFilas();
        //Construir el triángulo
        String cadenaSalida=cadenaTrianguloConsola(numeroFilas);
        String cadenaSalidaVentana=cadenaTrianguloHTML(numeroFilas);
        //Mostrar el triángulo
        System.out.println(cadenaSalida);
        JOptionPane.showMessageDialog(null,cadenaSalidaVentana);
    }

    private static String cadenaTrianguloConsola(int numeroFilas){
        return cadenaTriangulo(numeroFilas,"","\n","");
    }
    private static String cadenaTrianguloHTML(int numeroFilas){
        return cadenaTriangulo(numeroFilas
                ,"<html><pre style=\"font-size:"+(30-numeroFilas)+"px;color:#FF0080;\">"
                ,"<br>"
                ,"</pre></html>");
    }

    private static String cadenaTriangulo(int numeroFilas
            ,String encabezado
            ,String retornoDeCarro
            ,String cierre) {
        String salida=encabezado;
        int numeroActual=1;
        int numerosEnFila=1;
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numerosEnFila; j++) {
                salida+=String.format("%"+ESPACIOS_NUMEROS+"s",numeroActual + " ");
                numeroActual++;
            }
            numerosEnFila++;
            salida+=retornoDeCarro;
        }
        salida+=cierre;
        return salida;
    }
}
