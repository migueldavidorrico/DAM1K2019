/* Imprimir los números primos hasta uno dado
un número es primo si solo se divide entre 1 y consigo mismo
3 es primo
1 no es primo
15 no es primo

 */
public class Primos {
    public static void main(String[] args) {
        int numero=2000;
//        System.out.print("2 ");
//        for (int i = 3; i <= numero; i+=2) {
//            if(esPrimo(i)){
//                System.out.print(i+" ");
//            }
//
//        }

        //40 primeros números primos
        int primosObtenidos=0;
        int numeroQueMiro=2;
        while (primosObtenidos < 10) {
            if(esPrimo(numeroQueMiro)){
                System.out.println(numeroQueMiro);
                primosObtenidos++;
            }
            numeroQueMiro++;
        }


//        int numeroFinal=20;
//        for (int i = 2; i <= numeroFinal; i++) {
//            int numeroActual=i;
//            boolean esPrimo=true;
//            for (int j = 2; j < numeroActual; j++) {
//                if(numeroActual%j==0){
//                    esPrimo=false;
//                }
//
//            }
//            if(esPrimo){
//                System.out.print(numeroActual + " ");
//            }
//        }

    }

    private static boolean esPrimo(int numero) {
        if(numero==2){
            return true;
        }
        for (int i = 2; i < Math.sqrt(numero)+1; i++) {
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }


}
