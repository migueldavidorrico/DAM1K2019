public class UtilidadesCadena {
    public static String reverse(String cadena) {
        String salida="";
        for (int i = cadena.length()-1; i >= 0; i--) {
            salida+=cadena.charAt(i);
        }
        return salida;
    }
}
