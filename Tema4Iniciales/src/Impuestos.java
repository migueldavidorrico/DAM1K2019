import javax.swing.*;

public class Impuestos {
    private static final int LIM_PRIMER_TRAMO = 1_000_000;
    private static final int IMPUESTO_PRIMER_TRAMO = 5;
    private static final int LIM_SEGUNDO_TRAMO = 2_500_000;
    private static final int IMPUESTO_SEGUNDO_TRAMO = 12;
    private static final int LIM_TERCER_TRAMO = 3_800_000;
    private static final int IMPUESTO_TERCER_TRAMO = 15;
    private static final int LIM_CUARTO_TRAMO = 6_000_000;
    private static final int IMPUESTO_CUARTO_TRAMO = 22;
    private static final int IMPUESTO_GRANDES_FORTUNAS = 30;

    public static void main(String[] args) {
        //Leer entrada
        int salario=Integer.parseInt(JOptionPane.showInputDialog("Salario?"));
        //Calcular impuesto
        int porcentajeImpuesto;
        if(salario<LIM_PRIMER_TRAMO){
            porcentajeImpuesto=IMPUESTO_PRIMER_TRAMO;
        } else if(salario<=LIM_SEGUNDO_TRAMO){
            porcentajeImpuesto=IMPUESTO_SEGUNDO_TRAMO;
        } else if(salario<LIM_TERCER_TRAMO){
            porcentajeImpuesto=IMPUESTO_TERCER_TRAMO;
        } else if(salario<LIM_CUARTO_TRAMO){
            porcentajeImpuesto=IMPUESTO_CUARTO_TRAMO;
        } else {
            porcentajeImpuesto=IMPUESTO_GRANDES_FORTUNAS;
        }
        //Calcular montante del impuesto
        int impuestoAPagar=salario*porcentajeImpuesto/100;
        //Imprimir el impuesto a pagar
        JOptionPane.showMessageDialog(null,"Tienes que pagar: "+impuestoAPagar);
    }
}
/*
< 1000000 5%
1000000-2500000 12%
2500001-3800000 15%
3800001-6000000 22%
> 6000000 30%
 */
