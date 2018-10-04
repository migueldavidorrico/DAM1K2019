public class CuadradoTexto {
    private String cadenaARepetir;
    CuadradoTexto(String cadenaARepetir){
        this.cadenaARepetir=cadenaARepetir;
    }

    public String cadenaCuadrado(){
        return cadenaARepetir+cadenaARepetir+cadenaARepetir+cadenaARepetir+'\n'+
                cadenaARepetir+cadenaARepetir+cadenaARepetir+cadenaARepetir+'\n'+
                cadenaARepetir+cadenaARepetir+cadenaARepetir+cadenaARepetir+'\n'+
                cadenaARepetir+cadenaARepetir+cadenaARepetir+cadenaARepetir+'\n';
    }


    public String getCadenaARepetir() {
        return cadenaARepetir;
    }

    public void setCadenaARepetir(String cadenaARepetir) {
        this.cadenaARepetir = cadenaARepetir;
    }


}
