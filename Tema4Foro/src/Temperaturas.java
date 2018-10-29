import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sumaTemperaturas=0;
        int temperaturaMinima=Integer.MAX_VALUE;
        int tamperaturaMaxima=Integer.MIN_VALUE;
        for (int i = 0; i <10; i++) {
            int temperaturaLeida=sc.nextInt();
            sumaTemperaturas+=temperaturaLeida;
            if(temperaturaLeida<temperaturaMinima){
                temperaturaMinima=temperaturaLeida;
            }
            if(temperaturaLeida>tamperaturaMaxima){
                tamperaturaMaxima=temperaturaLeida;
            }
        }
        double media=sumaTemperaturas/10;
        System.out.println("La temperatura media es: " + media);
        System.out.println("La mínima es:" + temperaturaMinima);
        System.out.println("La máxima es:" + tamperaturaMaxima);

    }
}
