public class Cifras {
    public static void main(String[] args) {
        int numero=1543;
        String cifras="";
        int restante=numero;
        while(restante>10){
            cifras="-"+restante%10+cifras;
            restante=restante/10;
        }
        cifras=restante+cifras;
        System.out.println(cifras);
    }
}
