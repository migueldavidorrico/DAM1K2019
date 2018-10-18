import javax.swing.*;

public class Cuadrado {
    private int ancho;
    private int alto;
    private String externo;

    public String cadenaCuadrado(){
        String salida="";
        for(int i=0;i<alto;i++) {
            for (int j = 0; j < ancho; j++) {
                salida += externo;
            }
            salida+="\n";
        }

        return salida;
    }

    public String salidaHTML(){
        String salida="<html>";
        salida+="<pre style=\"font-size:24; color:#F000EE;\">";
        for(int i=0;i<alto;i++) {
            for (int j = 0; j < ancho; j++) {
                salida += externo;
            }
            salida+="<br>";
        }


        return salida+"</html>";
    }

    public static void main(String[] args) {
        Cuadrado micuadrado=new Cuadrado(45);
        Cuadrado otro=new Cuadrado(30,10);
        Cuadrado sumas=new Cuadrado(5,"+");
        Cuadrado rectSumas=new Cuadrado(30,10,"#");
        JOptionPane.showMessageDialog(null,rectSumas.salidaHTML());
    }

    Cuadrado(int ancho,int alto,String externo){
        this.ancho=ancho;
        this.alto=alto;
        this.externo=externo;
    }
    Cuadrado(int ancho,int alto){
        this(ancho,alto,"*");
    }

    Cuadrado(int anchoYAlto){
        this(anchoYAlto,anchoYAlto,"*");
    }
    Cuadrado(int anchoYAlto,String externo){
        this(anchoYAlto,anchoYAlto,externo);
    }

}
