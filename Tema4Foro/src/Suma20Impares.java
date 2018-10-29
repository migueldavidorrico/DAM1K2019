public class Suma20Impares {
    public static void main(String[] args) {
        int imparActual=1;
        int sumaImpares=0;
        for (int i = 0; i < 20; i++) {
            sumaImpares+=imparActual;
            imparActual+=2;
        }
        System.out.println(sumaImpares);
        //Otra forma
        int imparesQueLlevo=1;
        imparActual=1;
        sumaImpares=0;
        while(imparesQueLlevo++<=20){
            sumaImpares+=imparActual;
            imparActual+=2;
        }
        System.out.println(sumaImpares);


    }
}
