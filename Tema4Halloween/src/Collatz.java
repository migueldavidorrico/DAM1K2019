public class Collatz {
    public static void main(String[] args) {
        int numeroActual=24;
        while(numeroActual!=1){
            System.out.print(numeroActual+", ");
            if(numeroActual%2==0){
                numeroActual=numeroActual/2;
            } else {
                numeroActual=numeroActual*3+1;
            }
        }
        System.out.println(numeroActual);
    }
}
/*
Ejercicio muy típico:
Secuencia de collatz
Tome cualquier número natural n.

Si n es par, divídelo por 2 para obtener n / 2.
Si n es impar, multiplíquelo por 3 y agregue 1
para obtener 3n + 1.
Repita el proceso indefinidamente.
En 1937, Lothar Collatz propuso que no importa
con qué número comience, la secuencia finalmente
llega a 1. Se cree que esto es cierto,
pero nunca se ha demostrado formalmente.

Escriba un programa que ingrese un número del usuario y luego
muestre la secuencia de Collatz a partir de ese número.
Pare cuando llegue a 1
 */
