public class FloydParando {
    public static void main(String[] args) {
        int numeroFinal=29;
        int numeroActual=1;
        int numerosEnFila=1;
        int numerosEnFilaActual=0;
        for (int i = 0; i < numeroFinal; i++) {
            System.out.print(numeroActual+" ");
            numeroActual++;
            numerosEnFilaActual++;
            if(numerosEnFilaActual==numerosEnFila){
                numerosEnFilaActual=0;
                numerosEnFila++;
                System.out.println("");
            }
        }
    }
}
