import javax.swing.*;

public class RepartirDomino {
    public static void main(String[] args) {
        FichaDomino fichaActual=new FichaDomino(0,0);
        int numeroFichas=Integer.parseInt(JOptionPane.showInputDialog("Numero de fichas"));
        while(numeroFichas>0){
            for (int i = 0; i < numeroFichas; i++) {
                System.out.println(fichaActual.cadenaFicha());
                fichaActual=fichaSiguiente(fichaActual);
            }
            numeroFichas=Integer.parseInt(JOptionPane.showInputDialog("Numero de fichas"));

        }
    }

    private static FichaDomino fichaSiguiente(FichaDomino fichaActual) {
        int izquierda=fichaActual.getIzquierda();
        int derecha=fichaActual.getDerecha();
        derecha++;
        if(derecha>6){
            derecha=0;
            izquierda++;
        }

        return new FichaDomino(izquierda,derecha);
    }

}
