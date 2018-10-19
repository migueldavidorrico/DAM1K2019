import javax.swing.*;

public class Juego {
    public static void main(String[] args) {

        int rangoAdivinar=Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango de valores en los que se encuentra el número:"));
        int numeroAdivinar = (int) (Math.random() *rangoAdivinar ) + 1;

        char conIntentos= JOptionPane.showInputDialog("¿Con limite  de intentos?\n (s)SÍ  (n)No").charAt(0);
        switch(conIntentos){
            case 's':

                int limiteIntentos=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número de intentos:"));
                while(limiteIntentos<=0){
                    limiteIntentos=Integer.parseInt(JOptionPane.showInputDialog("El número "+limiteIntentos+" no es válido, introduce otro."));
                }


                String mensajeInicial="Tienes que adivinar un número del 1 al "+rangoAdivinar+" en "+limiteIntentos+ " intentos ";
                JOptionPane.showMessageDialog(null,mensajeInicial);


                int numeroDelUsuario;

                int intentos = 0;

                do{
                    numeroDelUsuario=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

                    if(numeroDelUsuario>rangoAdivinar || numeroDelUsuario<1){
                        JOptionPane.showMessageDialog(null,"El número "+numeroDelUsuario+" no se encuentra dentro del rango 1 al "+rangoAdivinar);
                    } else {

                        if (numeroDelUsuario > numeroAdivinar) {
                            JOptionPane.showMessageDialog(null, "Es menor que " + numeroDelUsuario);
                        }
                        if (numeroDelUsuario < numeroAdivinar) {
                            JOptionPane.showMessageDialog(null, "Es mayor que " + numeroDelUsuario);

                        }
                        intentos++;
                    }

                }while(numeroAdivinar!=numeroDelUsuario && intentos<limiteIntentos);
                if (numeroAdivinar==numeroDelUsuario && intentos<=limiteIntentos){

                    JOptionPane.showMessageDialog(null,"¡Has Ganado!\n Lo has adivinado en "+intentos+" Intentos");
                } else {
                    JOptionPane.showMessageDialog(null,"¡Has Perdido!\n Has superado el limite de " +limiteIntentos+ " intentos.");

                }


                break;


            case 'n':
                mensajeInicial="Tienes que adivinar un número del 1 al "+rangoAdivinar;
                JOptionPane.showMessageDialog(null,mensajeInicial);
                String peticion="Introduce un número";
                do{
                    numeroDelUsuario = Integer.parseInt(JOptionPane.showInputDialog(peticion));
                    if(numeroDelUsuario>numeroAdivinar){
                        peticion="Te has pasado";
                    } else if (numeroDelUsuario<numeroAdivinar){
                        peticion="No has llegado";
                    }

                } while(numeroAdivinar!=numeroDelUsuario);
//                numeroDelUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
//                while(numeroDelUsuario!=numeroAdivinar){
//                    if(numeroDelUsuario>numeroAdivinar){
//                        numeroDelUsuario = Integer.parseInt(JOptionPane.showInputDialog("Te has pasado. El número es menor"));
//                    } else {
//                        numeroDelUsuario = Integer.parseInt(JOptionPane.showInputDialog("No has llegado. El número es mayor"));
//
//                    }
//                }
                JOptionPane.showMessageDialog(null,"¡Has Ganado!\n Lo has adivinado");
                break;

        }
    }
}