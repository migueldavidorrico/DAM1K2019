public class Menu {
    public static final int TOTAL_PRODUCTOS=9;
    static Producto refresco=new Producto("Refresco",200,"BEBIDA");
    static Producto cerveza=new Producto("Cerveza",150,"BEBIDA");
    static Producto agua=new Producto("Agua Mineral",175,"BEBIDA");
    static Producto ensalada=new Producto("Ensalada",200,"COMIDA");
    static Producto salchicha=new Producto("Salchichas",275,"COMIDA");
    static Producto bocadillo=new Producto("Bocadillo",200,"COMIDA");
    static Producto sopa=new Producto("Sopa",260,"BEBIDA");
    static Producto pastel=new Producto("Pastel",300,"COMIDA");
    static Producto cocacola=new Producto("Coca-Cola",400,"BEBIDA");

    static Producto seleccionaPorNumero(int numero){
        switch(numero){
            case 1:return refresco;
            case 2:return cerveza;
            case 3:return agua;
            case 4:return ensalada;
            case 5:return salchicha;
            case 6:return bocadillo;
            case 7:return sopa;
            case 8:return pastel;
            case 9:return cocacola;
            default:return refresco;
        }
    }
}
