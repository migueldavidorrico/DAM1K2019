import java.util.Scanner;

public class PruebaScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero?:");
        int numero=sc.nextInt();
        System.out.println(numero);
        System.out.println("Cadena?:");
        String cadena=sc.nextLine();
        System.out.println(cadena);

    }
}
