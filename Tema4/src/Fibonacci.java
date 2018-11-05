//Sucesión de Fibonacci
//El primer número es 1
//El segundo número es 1
//Cada número es la suma de los dos anteriores
public class Fibonacci {
    static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {

    }

}

