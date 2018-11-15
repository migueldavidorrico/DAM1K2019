public class CadenaSerpiente {
    public static void main(String[] args) {
        String cadena="HOLA, que tal estas. Yo bien";
        //PRIMERA OPCION
        for (int i = 0; i < cadena.length(); i++) {
            if(i%2==0){
                System.out.print(cadena.charAt(i));
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
        for (int i = 0; i < cadena.length(); i++) {
            if(i%2!=0){
                System.out.print(cadena.charAt(i));
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
        //SEGUNDA OPCION
        String lineaSuperior="";
        String lineaInferior="";
        for (int i = 0; i < cadena.length(); i++) {
            if(i%2==0){
                lineaSuperior+=cadena.charAt(i);
                lineaInferior+=" ";
            } else {
                lineaInferior+=cadena.charAt(i);
                lineaSuperior+=" ";
            }
        }
        System.out.println(lineaSuperior);
        System.out.println(lineaInferior);
    }
}
