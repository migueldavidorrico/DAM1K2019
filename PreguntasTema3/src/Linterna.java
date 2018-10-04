public class Linterna {
    private final String marca;
    private final String modelo;
    private final int pilasNecesarias;
    private final int luminosidad;
    private boolean estaApagada;
    private int precio;

    Linterna(String marca,String modelo,int pilasNecesarias,int luminosidad,int precio){
        this.marca=marca;
        this.modelo=modelo;
        this.pilasNecesarias=pilasNecesarias;
        this.luminosidad=luminosidad;
        this.precio=precio;
        this.estaApagada=true;
    }
    public void rebajar(int eurosARebajar){
        precio-=eurosARebajar;
    }

    public void encender(){
        estaApagada=false;
    }

    public void apagar(){
        estaApagada=true;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public int getPilasNecesarias(){
        return pilasNecesarias;
    }
    public  int getPrecio(){
        return precio;
    }
    public int getLuminosidad(){
        return luminosidad;
    }

}

/*

Hacer un programa de prueba que cree varias linternas, ejecute
varios métodos sobre esas linternas y muestre los datos de las linternas.
otm@iesseveroochoa.net
 */

