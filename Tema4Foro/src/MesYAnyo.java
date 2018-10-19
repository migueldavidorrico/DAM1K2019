import javax.swing.*;

public class MesYAnyo {
    public static void main(String[] args) {
        int mes=Integer.parseInt(JOptionPane.showInputDialog("MES?"));
        String salida="Estamos en ";
        String cadenaMes;
        switch(mes){
            case 1:cadenaMes="enero";
            break;
            case 2:cadenaMes="febrero";
            break;
            case 3:cadenaMes="marzo";
            break;
            case 4:cadenaMes="abril";
            break;
            case 5:cadenaMes="mayo";
            break;
            case 6:cadenaMes="junio";
            break;
            case 7:cadenaMes="julio";
            break;
            case 8:cadenaMes="agosto";
            break;
            case 9:cadenaMes="septiembre";
            break;
            case 10:cadenaMes="octubre";
            break;
            case 11:cadenaMes="noviembre";
            break;
            case 12:cadenaMes="diciembre";
            break;
            default:cadenaMes=" No existe";
            break;
        }
        int dias;
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias=30;
                break;
            case 2:
                dias=28;
                break;
                default:dias=0;
                break;


        }
        JOptionPane.showMessageDialog(null,salida+cadenaMes+" y tiene "+dias);
    }
}
