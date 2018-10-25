public class MaquinaExpendedora {
    public static void main(String[] args) {
        String salida="";
        Menu menu=new Menu();
        for (int i = 0; i < Menu.TOTAL_PRODUCTOS; i++) {
            salida+=menu.seleccionaPorNumero(i+1).cadenaProducto()+"\n";
        }

        System.out.println(salida);

    }

}
