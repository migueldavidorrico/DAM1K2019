public class TrianguloRectanguloAsteriscos {
    public static void main(String[] args) {
        int filas=7;
        String cadenaFinal="";
        for (int i = 1; i <= filas; i++) {
            String filaAsteriscos="";
            for (int j=1;j<=i;j++) {
                filaAsteriscos+="*";
            }
            cadenaFinal+=String.format("%"+filas+"s%n",filaAsteriscos);
        }
        System.out.println(cadenaFinal);


        //NO HACER
        cadenaFinal="";
        for (int i = 1, numeroEspacios=filas-1; i <= filas; i++,numeroEspacios--,cadenaFinal+="\n") {
            for (int j = 0; j < numeroEspacios; j++)
                cadenaFinal+=" ";
            for (int j = 0; j < i; j++)
                cadenaFinal+="*";
        }
        System.out.println(cadenaFinal);
    }
}
