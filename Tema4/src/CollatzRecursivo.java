/*1.
(1 punto)
 Desarrollar un método recursivo que devuelva en una cadena la secuencia de Collatz
de un número entero dado según la siguiente definición:
Caso Base:
•
Si el número es 1, se devuelve la cadena “1”
Caso Recursivo:
•
Si el número es par, devolver la cadena del número concatenada con
 un espacio y la
secuencia del número partido por dos
•
Si el número es impar, devolver la cadena del número concatenada
con un espacio y la
secuencia del número multiplicado por 3 más uno. */
public class CollatzRecursivo {
        static String cadenaCollatz(int n){
            if(n==1){
                return "1";
            } else {
                if(n%2==0){
                    return ""+n+" "+cadenaCollatz(n/2);
                } else {
                    return ""+n+" "+cadenaCollatz(n*3+1);
                }

            }
        }

    public static void main(String[] args) {
        System.out.println(cadenaCollatz(77));
    }
}
