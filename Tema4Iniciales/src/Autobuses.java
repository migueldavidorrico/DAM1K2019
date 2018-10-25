public class Autobuses {
    //TODO poner todas las constantes necesarias
    public static void main(String[] args) {
        int personas=10;
        int kms=150;
        int precioBillete=2000;
        if(kms>200){
            int kmsAdicionales=kms-200;
            precioBillete+=3*kmsAdicionales;
        }
        if(kms>400){
            precioBillete=precioBillete-precioBillete*15/100;
        }
        if(personas>=3){
            precioBillete=precioBillete-precioBillete*10/100;
        }

        //TODO poner bien la salida de los euros con 03
        System.out.println(precioBillete/100+","+precioBillete%100);
        if(personas>1){
            int precioTotal=precioBillete*personas;
            System.out.println(precioTotal/100+","+precioTotal%100);

        }

    }

}
/*
Una línea de autobuses cobra un mínimo de 20 eur
os por persona  y  trayecto. Si el trayecto  es mayor
de 200 km el billete
tiene  un  recargo  de  3  céntimos  por  km  adicional.  Si
n  embargo,  para  trayectos  de  más  de  400  km  el  bille
te  tiene  un
descuento  del  15  %.  Por  otro  lado,  para  grupos  de  3
  o  más  personas  el  billete  tiene  un  descuento  del  1
0  %.  Con  las
consideraciones anteriores, escriba en Java un prog
rama estructurado que lea por teclado la distancia
del viaje a realizar,
así como el número de personas que viajan juntas. C
on ello se debe calcular tanto el precio del billet
e individual como el
total a pagar si viaja más de una persona
 */
