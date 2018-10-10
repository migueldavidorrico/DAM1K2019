public class MiNumero {
    private final int numero;

    MiNumero(int numero){
        this.numero=numero;
    }

    public int doble(){
        return numero*2;
    }

    public int triple(){
        return numero*3;
    }
    public int cuadruple(){
        return numero*4;
    }

    public static void main(String[] args) {
        MiNumero numero=new MiNumero(8);
        System.out.println("El doble es:" + numero.doble());
    }
}
