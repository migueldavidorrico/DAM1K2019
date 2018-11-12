import java.util.Scanner;

public class DivisoresDeNumero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero=ESPropia.devuelveNumeroPositivo(sc);
        String salida="";
//        int numeroMirando=2;
//        while(numero%numeroMirando!=0 && numeroMirando<numero){
//            numeroMirando++;
//        }
//        if(numeroMirando!=numero)
//        {
//            salida+=numeroMirando;
//        }
//        for (int i = numeroMirando+1; i < numero; i++) {
//            if(numero%i==0){
//                salida+=", "+i;
//            }
//
//        }
        for (int i = 2; i < numero; i++) {
            if(numero%i==0){
                salida+=i+", ";
            }
        }
        String salidaBuena="";
        if(!salida.equals("")){
            salidaBuena=salida.substring(0,salida.length()-2);
        }
        System.out.println(salidaBuena);

//        String salidaBuena="";
//        for (int i = 0; i < salida.length()-2; i++) {
//            salidaBuena+=salida.charAt(i);
//
//        }
//        System.out.println(salidaBuena);

    }
}
