import java.util.Scanner;

public class MaquinaExpendedora {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeroSeleccionado;
        do{
            System.out.println(cadenaMenu());
            System.out.print("INTRODUZCA SU ELECCIÓN: ");
            numeroSeleccionado=sc.nextInt();
            if(numeroSeleccionado>0 && numeroSeleccionado<Menu.TOTAL_PRODUCTOS){
                System.out.println(Menu.seleccionaPorNumero(numeroSeleccionado).cadenaProducto());
            }
        } while(numeroSeleccionado!=0);
        System.out.println("Has elegido: " + numeroSeleccionado);

    }

    public static String cadenaMenu(){
        String salida="0 para salir\n";
        for (int i = 0; i < Menu.TOTAL_PRODUCTOS; i++) {
            salida+=Menu.seleccionaPorNumero(i+1).cadenaProducto()+"\n";
        }
        return salida;
    }

}
