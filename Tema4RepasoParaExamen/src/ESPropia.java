import java.util.Scanner;

public class ESPropia {
    public static int devuelveNumeroPositivo(Scanner sc){
        return devuelveNumeroEnIntervaloConsola(sc,1);
    }
    public static int devuelveNumeroEnIntervaloConsola(Scanner sc, int numeroMinimo){
        return devuelveNumeroEnIntervaloConsola(sc,numeroMinimo,Integer.MAX_VALUE);
    }
    public static int devuelveNumeroEnIntervaloConsola(Scanner sc, int numeroMinimo, int numeroMaximo){

        String prompt="Introduzca un número positivo mayor que "
                +(numeroMinimo-1)
                +(numeroMaximo==Integer.MAX_VALUE?" :":" y menor o igual que "+numeroMaximo+":");
        System.out.print(prompt);
        int numeroIntroducido=sc.nextInt();
        while(numeroIntroducido<numeroMinimo || numeroIntroducido>numeroMaximo){
            System.out.println("ERROR EN EL NÚMERO");
            System.out.print(prompt);
            numeroIntroducido=sc.nextInt();
        }
        return numeroIntroducido;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(devuelveNumeroEnIntervaloConsola(sc,1,50));
        System.out.println(devuelveNumeroEnIntervaloConsola(sc, 5));
    }

}
