public class OperadorTernario {
    public static void main(String[] args) {
        /*El operador ternario tiene tres partes:
            Booleano antes de ?
            Valor si true antes de :
            Valor si false después de :
           */
        int a=100;
        String cadena=(a==100)?"a es cien":"a no es cien";
        int edad=18;
        //Error de uso de booleanos. NO HACER. QUEDA MAL
        boolean esMayorDeEdad=(edad>=18)?true:false;
        //Equivalente a
        esMayorDeEdad=(edad>=18);
        String votacion=esMayorDeEdad?"Puede Votar":"No puede Votar";
        int cochesConducidosElUltimoMes=esMayorDeEdad?32:0;
        String firmaConsentimiento=(!esMayorDeEdad)?"Firma de Padres":"No necesita";
        int numero=2;
        //NO HACER
        String numeroEnLetras=(numero==1)?"uno":
                (numero==2)?"dos":
                        (numero==3)?"tres":"muy grande";
        System.out.println(numeroEnLetras);
    }
}
