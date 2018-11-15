import javax.swing.JOptionPane;

public class DadoDominoDadoRol {

    public static final int DADO_Y_DOMINO = 6;

    public static void main(String[] args) {
        String elegirDado = JOptionPane.showInputDialog("Dados a elegir: Dado, domino o rol?");
        int numero = 0;
        String salida= "";

        if (elegirDado.length() == 4) {
            for(int i=1; i<=DADO_Y_DOMINO; i++) {
                for(int j=1; j<=DADO_Y_DOMINO; j++) {
                    System.out.println(i+" "+j);
                    salida += i+" "+j+"\n";
                }
                salida += "\n";
                System.out.println("");
            }
        }

        if (elegirDado.length() == 6) {
            for(int i=0; i<=DADO_Y_DOMINO; i++) {
                for(int j=0; j<=DADO_Y_DOMINO; j++) {
                    System.out.println(i+" "+j);
                    salida += i+" "+j+"\n";
                }
                salida += "\n";
                System.out.println("");
            }
        }

        if (elegirDado.length() == 3) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Cuántas caras quieres que tenga?"));
        }
        if (elegirDado.length() == 3) {
            for(int i=1; i<=numero; i++) {
                for(int j=1; j<=numero; j++) {
                    System.out.println(i+" "+j);
                    salida += i+" "+j+"\n";
                }
                salida += "\n";
                System.out.println("");
            }
        }

        JOptionPane.showMessageDialog(null, salida);
    }

}
