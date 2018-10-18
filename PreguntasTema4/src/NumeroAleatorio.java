public class NumeroAleatorio {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int numero=(int)(Math.random()*5)+1;
            System.out.printf("%d%n",numero);
        }
    }
}
