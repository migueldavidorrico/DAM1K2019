public class PiramideInvertida {
    public static void main(String[] args) {
        int altura=23;
        int ancho=(altura-1)*2+1;

        int espaciosIniciales=0;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espaciosIniciales; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println("");
            ancho=ancho-2;
            espaciosIniciales++;
        }
    }

}


/*Crea una aplicación que dibuje una pirámide invertida de asteriscos.
Nosotros le pasamos la altura de la pirámide por teclado. Este es un ejemplo:
 *********
  *******
   *****
    ***
     *
*/