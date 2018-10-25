public class Producto {
    private final int codigo;
    private final String descripcion;
    private int precio;
    private final String tipo;

    private static int codigoActual=1;

    Producto(String descripcion,int precio,String tipo){
        this.codigo=Producto.codigoActual++;
        this.descripcion=descripcion;
        this.precio=precio;
        this.tipo=tipo;
    }

    String cadenaProducto(){
        String salida=this.codigo+" - "+
                this.descripcion+" "
                +this.precio/100+","+this.precio%100+" € Es: "
                +this.tipo;
        return salida;
    }



}
