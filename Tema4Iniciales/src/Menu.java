public class Menu {
    public static final int TOTAL_PRODUCTOS=9;
    Producto refresco=new Producto("Refresco",200,"BEBIDA");
    Producto cerveza=new Producto("Cerveza",150,"BEBIDA");
    Producto agua=new Producto("Agua Mineral",175,"BEBIDA");
    Producto ensalada=new Producto("Ensalada",200,"COMIDA");
    Producto salchicha=new Producto("Salchichas",275,"COMIDA");
    Producto bocadillo=new Producto("Bocadillo",200,"COMIDA");
    Producto sopa=new Producto("Sopa",260,"BEBIDA");
    Producto pastel=new Producto("Pastel",300,"COMIDA");
    Producto cocacola=new Producto("Coca-Cola",400,"BEBIDA");

    Producto seleccionaPorNumero(int numero){
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
