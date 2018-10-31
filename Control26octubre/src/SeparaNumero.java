




//Dado un número, decir las cifras y separarlas po un guión
//88823 5 cifras y 8-8-8-2-3
public class SeparaNumero {
    public static void main(String[] args) {
        int numeroASeparar=8081777;

        String salida="";
        int numeroQueQueda=numeroASeparar;
        while(numeroQueQueda>9){
            int ultimo=numeroQueQueda%10;
            salida+=ultimo+"-";
            numeroQueQueda=numeroQueQueda/10;
        }
        salida+=numeroQueQueda;
        String salidaBuena=UtilidadesCadena.reverse(salida);
        System.out.println(salidaBuena);
        System.out.println(UtilidadesCadena.reverse("Dábale arroz a la zorra el abad"));



//        String salidaBuena="";
//        for (int i = salida.length()-1; i >= 0; i--) {
//            salidaBuena+=salida.charAt(i);
//        }
//
//        System.out.println(salidaBuena);



//        String salida="";
//        int numeroQueQueda=numeroASeparar;
//        while(numeroQueQueda>9){
//            int ultimo=numeroQueQueda%10;
//            salida="-"+ultimo+salida;
//            numeroQueQueda=numeroQueQueda/10;
//        }
//        salida=numeroQueQueda+salida;
//        System.out.println(salida);

//        String cadenaNumero=""+numeroASeparar;
//        System.out.println("Tiene: " + cadenaNumero.length() + " cifras");
//
//        String salida=""+cadenaNumero.charAt(0);
//
//        for(int i=1;i<cadenaNumero.length();i++){
//            salida+="-";
//            salida+=cadenaNumero.charAt(i);
//        }
//        System.out.println(salida);
    }
}
