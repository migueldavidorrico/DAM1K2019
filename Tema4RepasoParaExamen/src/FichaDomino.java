public class FichaDomino {
    private final int izquierda;
    private final int derecha;

    public int getIzquierda() {
        return izquierda;
    }

    public int getDerecha() {
        return derecha;
    }

    @Override
    public String toString() {
        return "FichaDomino{" +
                "izquierda=" + izquierda +
                ", derecha=" + derecha +
                '}';
    }

    public String cadenaFicha(){
        String salida="";
        String segundaParte="";
        if(izquierda==derecha){
            segundaParte="doble";
        }
        salida+=numeroComoLetrasDomino(izquierda)+" ";
        if(segundaParte.equals("")){
            salida+=numeroComoLetrasDomino(derecha);
        } else {
            salida+=segundaParte;
        }

        return salida;
    }

    private static String numeroComoLetrasDomino(int numero) {
        switch (numero){
            case 0:return "blanca";
            case 1:return  "pito";
            case 2:return "dos";
            case 3:return "tres";
            case 4:return "cuatro";
            case 5:return "cinco";
            case 6:return "seis";
            default:return "";
        }
    }

    public FichaDomino(int izquierda, int derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public static void main(String[] args) {
        FichaDomino f=new FichaDomino(4,4);
        System.out.println(f);
        System.out.println(f.cadenaFicha());
    }



}
