public class PiramideNumerica2 {
    public static void main(String[] args) {
        int filas=8;
        String numero="1";
        for (int i = 2; i <filas+2; i++) {
            System.out.println(numero);
            numero+=i;
        }
    }
}

/*Se introduce una cadena por teclado, imprimirla alternada
Cadena?:Hace un buen día
H c   n b e   í
 a e u   u n d a

Cadena?:abcdefghijk
a c e g i k
 b d f h j
*/