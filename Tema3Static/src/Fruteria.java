public class Fruteria {
    public static void main(String[] args) {
        Producto limones=new Producto("1Kg de Limones",50);
        Producto kiwi=new Producto("Un kiwi",25);
        System.out.println("Estamos cobrando el " + Producto.IVA_PRODUCTOS + " de IVA");
        System.out.println("Tenemos: " +limones.informacion());
        System.out.println("Tenemos: " + kiwi.informacion());
        System.out.println("Número de productos:"+Producto.getNumeroProductosCreados());
    }
}
