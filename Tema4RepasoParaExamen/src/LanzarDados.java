public class LanzarDados {
    public static void main(String[] args) {
        int primerNumero=1;
        int segundoNumero=1;
        for (int i = 0; i < 36; i++) {
            System.out.println(primerNumero + " " + segundoNumero);
            segundoNumero++;
            if(segundoNumero>6){
                segundoNumero=1;
                primerNumero++;
            }
        }
    }
}
