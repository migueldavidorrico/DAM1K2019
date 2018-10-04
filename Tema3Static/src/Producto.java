public class Producto {
    public static final int IVA_PRODUCTOS = 21;
    private static final String NOMBRE_DE_LA_TIENDA = "LA TIENDA ES TIEN21 ";
    private static final String MONEDA = " centimos.";
    private static final String SEPARADOR_PRODUCTO_PRECIO = " - ";
    private final String referencia;
    private final int precioAntesIVA;

    private static int numeroProductosCreados=0;

    Producto(String referencia,int precioAntesIVA){
        this.referencia=referencia;
        this.precioAntesIVA=precioAntesIVA;
        numeroProductosCreados++;
    }

    public static int getNumeroProductosCreados(){
        return numeroProductosCreados;
    }


    public String informacion(){
        return NOMBRE_DE_LA_TIENDA+this.referencia+SEPARADOR_PRODUCTO_PRECIO+this.precio()+MONEDA;
    }

    public String getReferencia(){
        return referencia;
    }

    public int getPrecioAntesIVA(){
        return precioAntesIVA;
    }

    //IVA 21 %

    public int precio(){
        return precioAntesIVA+precioAntesIVA*IVA_PRODUCTOS/100;
    }

}
