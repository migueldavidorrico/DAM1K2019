public class Pez {
    private final String especie;
    private int tamanyo;

    private static int numeroPeces=0;

    public static int getNumeroPeces() {
        return numeroPeces;
    }



    public Pez(String especie, int tamanyo) {
        this.especie = especie;
        this.tamanyo = tamanyo;
        numeroPeces++;
    }

    public String getEspecie() {
        return especie;
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }

    public static void main(String[] args) {
    }
}
