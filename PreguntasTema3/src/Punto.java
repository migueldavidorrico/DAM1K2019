
public class Punto {
    private double x;
    private double y;

    public double distancia(Punto punto){
        //clacular la diatancia del punto this al punto que me pasan
        return Math.sqrt((this.x-punto.x)*(this.x-punto.x)+(this.y-punto.y)*(this.y-punto.y));
    }

    Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    Punto(){
        this(0,0);
    }
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

}
/*
Definir una clase que represente un punto en un espacio bidimensional.
 La clase debe disponer de un constructor con las coordenadas del punto y
 métodos accesores a las coordenadas.



Escriba un programa que instancie cuatro puntos: el primero situado en el origen, el segundo situado en (5, 3), el tercero en (2, -1) y para el cuarto como punto medio entre el segundo y el tercero.



Añada a la clase Punto un constructor sin parámetros que permita construir puntos
 en el origen de coordenadas.



Añada un método a la clase Punto que calcule la distancia a otro punto.
 d es igual a la raíz cuadrada de la x de a menos la x de b al cuadrado mas
 la y de a menos la y de b al cuadrado. Utilizar Math.sqrt



Escriba un programa que cree un punto en (4, 3) e imprima la distancia del punto al origen de coordenadas. Para calcular la distancia de un punto al origen, se aplica el teorema de Pitágoras, resultando   d es igual a la raiz cuadrada de x al cuadrado más y al cuadrado.No obstante, dado que se dispone del método distancia a otro punto, se puede calcular la distancia al punto origen de coordenadas.



Escribe: Se escribe el mensaje "Distancia de p al origen" seguido del valor.





Escriba la clase Punto con dos métodos llamados distancia.
Uno de ellos calcula la distancia a otro punto y el otro calcula la distancia al origen.
 */
