import javax.swing.*;

public class DemostracionSwitch {
    public static void main(String[] args) {
        int numero = 487396;
        String salida;
        switch (numero) {
            case 1:
                salida = "uno";
                break;
            case 2:
                salida = "dos";
                break;
            case 3:
                salida = "tres";
                break;
            default:
                salida = "numero no reconocido";
                break;
        }
        System.out.println(salida);
        char letra = 'w';
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("No es vocal minúscula");
                break;
        }
        String nombre= JOptionPane.showInputDialog("Nombre?");
        String apellidos=JOptionPane.showInputDialog("Apellido?");
        switch(nombre){
            case "Ana":
                System.out.println("Hola Ana");
                switch(apellidos){
                    case "Álvarez":
                        System.out.println("Eres la primera de la lista");
                        break;
                    case "Zurita":
                        System.out.println("Eres la última de la lista");
                        break;
                    default:break;
                }
                break;
            case "Bea":
                System.out.println("Encantado, Bea");
                break;
            case "Clara":
                System.out.println("¿Otra vez por aquí?");
                break;
                default:
                    System.out.println("No te conozco");
                    break;
        }

    }
}
