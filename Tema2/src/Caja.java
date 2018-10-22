import javax.swing.*;

public class Caja {

    public static void main(String[] args) {
        int importeIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un importe"));


        String salida=""+importeIntroducido
                +" € se clafica en los siguientes billetes:\n";
        //1540 euros
        int billetes500=importeIntroducido/500;
        int sobrante500=importeIntroducido-billetes500*500;
        salida+=billetes500>0?""+billetes500+((billetes500>1)?" billetes":" billete")+" de 500\n":"";

        int billetes200=sobrante500/200;
        int sobrante200=sobrante500%200;
        if(billetes200>0){
          if(billetes200>1){
              salida+=""+billetes200+" billetes de 200";
          } else {
              salida+=""+billetes200+" billete de 200";

          }
        }

        JOptionPane.showMessageDialog(null,salida);
    }

}

/*Realiza un programa que lea de teclado un importe en euros y nos indique
 el mínimo número de billetes y la cantidad sobrante que se pueden utilizar
  para obtener esa cantidad.



Por ejemplo:

232 euros:

0 billetes de 500

1 billetes de 200

0 billetes de 100

0 billetes de 50

1 billetes de 20

1 billetes de 10

Sobran 2 euros

Sólo se puede utilizar lo que se ha visto hasta ahora en clase.

Salida "bonita" (No se debe decir 0 billetes de...)*/

