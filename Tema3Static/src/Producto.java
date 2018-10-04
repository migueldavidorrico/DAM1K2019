public class Producto {
    private final String referencia;
    private final int precioAntesIVA;

    Producto(String referencia,int precioAntesIVA){
        this.referencia=referencia;
        this.precioAntesIVA=precioAntesIVA;
    }

    public String getReferencia(){
        return referencia;
    }

    public int getPrecioAntesIVA(){
        return precioAntesIVA;
    }

    //IVA 21 %

    public int precio(){
        return precioAntesIVA+precioAntesIVA*21/100;
    }

}
