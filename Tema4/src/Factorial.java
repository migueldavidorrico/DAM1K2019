/*Un método es recuirsivo cuando:
    -Tiene uno o más casos base
    -Tiene una o más llamadas a sí mismo
    */
//Factorial 6!=6*5*4*3*2*1
//Factorial 6!=6*5! 5!=5*4! 4!=4*3! 3!=3*2! 2!=2*1! 1!=1


public class Factorial {
    public static int factorial(int n){
        if(n==1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int numero=6;
        System.out.println(factorial(numero));
        /*
        for (int i = numero; i > 0; i--) {
            factorial=factorial*i;
            System.out.println(factorial + " - " + i);
        }
        */
    }
}
