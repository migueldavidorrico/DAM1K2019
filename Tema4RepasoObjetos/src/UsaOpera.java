public class UsaOpera {
    public static void main(String[] args) {
        int a=3, b=5;
        System.out.println(Opera.doblar(a));
        System.out.println(Opera.doblar(b));
        System.out.println(Opera.dividirPorDos (a));
        System.out.println(Opera.dividirPorDos (b));
    }
}

class Opera{
    public static int doblar(int numero){
        return numero*2;
    }
    public static int dividirPorDos(int numero){
        return numero/2;
    }
}

