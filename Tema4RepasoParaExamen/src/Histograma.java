import javax.swing.*;

public class Histograma {
    public static void main(String[] args) {

        int contadorPositivos=0;
        int contadorNegativos=0;
        int numeroIntroducido;
        do{
            numeroIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Numeros hasta cero:"));
            if(numeroIntroducido>0){
                contadorPositivos++;
            }
            if(numeroIntroducido<0){
                contadorNegativos++;
            }
        }while(numeroIntroducido!=0);


        JOptionPane.showMessageDialog(null,lineaHistograma("Positivos", contadorPositivos)+"\n"+
                lineaHistograma("Negativos",contadorNegativos));
    }
    public static String lineaHistograma(String leyenda,int numero){
        return lineaHistograma(leyenda,numero,'*');
    }
    public static String lineaHistograma(String leyenda,int numero,char simbolo){
        String salida=leyenda+": ";
        for (int i = 0; i < numero; i++) {
            salida+=simbolo;
        }
        return salida;
    }
}
