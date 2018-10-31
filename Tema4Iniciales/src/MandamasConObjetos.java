public class MandamasConObjetos {
    public static void main(String[] args) {
        Trabajador trabajadorIntroducido=ESTrabajador.pedirTRabajadorPorTeclado();
        Trabajador mandamas=trabajadorIntroducido;
        while(trabajadorIntroducido.getSueldo()>0){
            if(trabajadorIntroducido.getSueldo()>mandamas.getSueldo()){
                mandamas=trabajadorIntroducido;
            }
            trabajadorIntroducido=ESTrabajador.pedirTRabajadorPorTeclado();
        }
        System.out.println("El mandamas es: " + mandamas.infoTrabajador());
    }

}
