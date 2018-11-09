import java.util.Scanner;

public class DivisoresDeNumero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero=ESPropia.devuelveNumeroPositivo(sc);
        System.out.println("El número es:" + numero);
        int edad=ESPropia.devuelveNumeroEnIntervaloConsola(sc,18);
        System.out.println("La edad es: " + edad);
    }
}
