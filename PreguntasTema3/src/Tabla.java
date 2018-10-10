public class Tabla {
    private static String simbolo="*";
    private static String igual="=";

    private int numero;

    Tabla(int numero){
        this.numero=numero;
    }

    public static void ponteEnLetras(){
        Tabla.simbolo=" times ";
        Tabla.igual=" equals ";
    }

    public static void ponteEnSimbolos(){
        Tabla.simbolo="x";
        Tabla.igual="=";
    }


    public static void setSimbolo(String simbolo){
        Tabla.simbolo=simbolo;
    }

    public static void setIgual(String igual){
        Tabla.igual=igual;
    }


    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    private String linea(int numeroLinea){
        return numero + simbolo + numeroLinea + igual + numero * numeroLinea+'\n';
    }

    public String cadenaTabla(){
        String salida="";
        salida+=linea(1);
        salida+=linea(2);
        salida+=linea(3);
        salida+=linea(4);
        salida+=linea(5);
        salida+=linea(6);
        salida+=linea(7);
        salida+=linea(8);
        salida+=linea(9);
        salida+=linea(10);
        return salida;
    }

}
