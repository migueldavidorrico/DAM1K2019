/*
 * PruebaReloj
 *
 * Versión: 7-oct-2016
 *
 */

import javax.swing.*;

class Reloj{
    private int horas;
    private int minutos;
    private int segundos;

    private static int numeroRelojes=0;
    private static char separador=':';

    Reloj(){
        this(0,0,0);
    }

    Reloj(int horas,int minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        numeroRelojes++;
    }

    public static void cambiaSeparador(char c) {
        separador=c;
    }

    public static boolean esValida(int horas, int minutos, int segundos) {
        return (horas>=0 && horas<24)
                && (minutos>=0 && minutos<60)
                && (segundos>=0 && segundos<60);
    }

    public String devuelveHora() {
        String salida="";
        salida+=(horas<10?"0":"")+horas;
        salida+=separador;
        salida+=(minutos<10?"0":"")+minutos;
        salida+=separador;
        salida+=(segundos<10?"0":"")+segundos;
        return salida;
    }

    public static int totalRelojes(){
        return numeroRelojes;
    }

    public void leeHora() {
        int horas= Integer.parseInt(JOptionPane.showInputDialog("Horas?"));
        int minutos= Integer.parseInt(JOptionPane.showInputDialog("minutos?"));
        int segundos= Integer.parseInt(JOptionPane.showInputDialog("segundos?"));
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    public void sumaTiempo(int horasSumar, int minutosSumar, int segundosSumar) {
        int segundosTotales=(this.segundos+segundosSumar);
        this.segundos=segundosTotales%60;
        int minutosSobrantes=(this.segundos+segundosSumar)/60;
        int minutosTotales=(this.minutos+minutosSumar+minutosSobrantes);
        this.minutos=minutosTotales%60;
        int horasSobrantes=minutosTotales/60;
        this.horas=(this.horas+horasSumar+horasSobrantes)%24;
    }
}
/**
 *
 * @author Miguel-David Orrico Teruel
 */
public class PruebaReloj {

    public static void main(String[] args) throws InterruptedException {
        Reloj reloj1;
        Reloj reloj2;
        Reloj reloj3;
        reloj1=new Reloj();
        reloj2=new Reloj(3,45,5);
        System.out.println("Un reloj tiene la hora:"+reloj1.devuelveHora());
        System.out.println("El otro tiene la hora:"+reloj2.devuelveHora());
        System.out.println("Tenemos "+Reloj.totalRelojes()+" relojes");
        System.out.println("Cambiamos el separador a -");
        Reloj.cambiaSeparador('-');
        System.out.println("Leemos una hora");
        reloj3=new Reloj();
        reloj3.leeHora();
        System.out.println("Y la escribimos");
        System.out.println("El reloj leído tiene la hora:"
                +reloj3.devuelveHora());

        System.out.println("Sumamos 6:34:50 a la hora leída");
        reloj3.sumaTiempo(6, 34, 50);
        System.out.println("Ahora el reloj leído tiene la hora:"
                +reloj3.devuelveHora());
        System.out.println("Tenemos "+Reloj.totalRelojes()+" relojes");
        System.out.println("La hora 23:70:34 ¿Es válida?"
                +Reloj.esValida(23, 70, 34));

        while(true){
            Thread.sleep(1000);
            reloj3.sumaTiempo(0,0,1);
            System.out.println(reloj3.devuelveHora());
        }
    }

}
