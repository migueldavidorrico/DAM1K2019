import javax.swing.*;

public class Aceptaciones {
    public static void main(String[] args) {
        int nota=Integer.parseInt(JOptionPane.showInputDialog("Nota?"));
        int edad=Integer.parseInt((JOptionPane.showInputDialog("Edad?")));
        char sexo='v';
        boolean sexoInvalido=true;
        do {
            String entrada=JOptionPane.showInputDialog("Sexo (v) o (m)");
            if(entrada==null){
                JOptionPane.showMessageDialog(null,"No pulses Cancelar");
                continue;
            }
            if(entrada.length()==0){
                JOptionPane.showMessageDialog(null,"No puede estar vacío el sexo");
                continue;
            }
            sexo = entrada.charAt(0);
            sexo = Character.toUpperCase(sexo);
            sexoInvalido=(sexo!='V' && sexo!='M') || entrada.length()!=1;
            if(sexoInvalido){
                JOptionPane.showMessageDialog(null,"Sexo no reconocido");
            }
        } while(sexoInvalido);

        if(nota>=5 && edad>=18){
            if(sexo=='V') {
                System.out.println("ACEPTADO");
            } else {
                System.out.println("ACEPTADA");
            }
        } else {
            System.out.println("NO");
        }
    }
}
/*
Algoritmo que pida dos números 'nota' y 'edad'
y un carácter 'sexo' y muestre el mensaje 'ACEPTADO
' si la nota es mayor o
igual a cinco, la edad es mayor o igual a dieciocho
 y el sexo es 'V'. En caso de que se cumpla lo mism
o, pero el sexo sea 'M',
debe imprimir 'ACEPTADA'.
 */
