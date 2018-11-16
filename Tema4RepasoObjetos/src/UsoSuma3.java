public class UsoSuma3 {
    public static void main(String[] args) {
        String linea;
        int numero=23;
        Suma3 s=new Suma3(numero);
        System.out.println(s.devuelveId());
    }
}

class Suma3{
    private int numero;

    Suma3(int numero){
        this.numero=numero;
    }

    public int devuelveId(){
        return numero+3;
    }
}
