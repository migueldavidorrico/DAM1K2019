import java.util.Scanner;

public class PalabraCortaYLarga {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Número de palabras");
        int numeroPalabras=ESPropia.devuelveNumeroPositivo(sc);
        sc.nextLine();
        int longitudPalabraMinima=Integer.MAX_VALUE;
        String palabraMinima="";
        int longitudPalabraMaxima=0;
        String palabraMaxima="";

        for (int i = 0; i < numeroPalabras; i++) {
            System.out.print("Palabra " + i + ":");
            String palabraActual=sc.nextLine();
            if(palabraActual.length()>=longitudPalabraMaxima){
                longitudPalabraMaxima=palabraActual.length();
                palabraMaxima=palabraActual;
            }
            if(palabraActual.length()<=longitudPalabraMinima){
                longitudPalabraMinima=palabraActual.length();
                palabraMinima=palabraActual;
            }
        }
        System.out.println("La palabra más larga es: " + palabraMaxima);
        System.out.println("La palabra más corta es: " + palabraMinima);
    }
}
