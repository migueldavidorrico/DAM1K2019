public class TablaNatural {
    public static void main(String[] args) {
        int numeroPrimero=1;
        for(int i=0;i<10;i++){

            for (int j = numeroPrimero; j < numeroPrimero+10; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
            numeroPrimero+=10;
        }
    }
}
