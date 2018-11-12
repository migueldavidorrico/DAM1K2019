import java.util.Scanner;

public class Tramos {
    public static void main(String[] args) {
        int duracionTramo;
        int duracionTotal=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Duración tramo:");
        duracionTramo=sc.nextInt();
        while(duracionTramo!=0){
            duracionTotal+=duracionTramo;
            System.out.print("Duración tramo:");
            duracionTramo=sc.nextInt();
        }
        System.out.println(duracionTotal);
        System.out.println(cadenaHMM(duracionTotal));
    }

    private static String cadenaHMM(int minutos) {
        int horas=minutos/60;
        int minutosRestantes=minutos%60;
        return horas+":"+String.format("%02d",minutosRestantes);
    }
}
