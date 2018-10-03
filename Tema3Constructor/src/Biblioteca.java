import javax.swing.*;

public class Biblioteca {
    public static void main(String[] args) {
        Libro viaje=new Libro(
                "Viaje al centro de la tierra",
                "Julio Verne",
                753,
                "Novela",
                "Trata de la expedición de un profesor de mineralogía, su sobrino y un guía al interior del planeta tierra."
        );
        Libro tresMosqueteros=new Libro(
                "Los tres mosqueteros",
                "Alexandre Dumas",
                345,
                "Novela",
                "Narra las aventuras de DArtagnan, un joven de 18 años que se traslada a París para ser mosquetero. Junto a sus amigos Athos, Porthos y Aramis sirven al rey Luis XIII."
        );

        System.out.println(viaje.infoCorta());
        System.out.println(tresMosqueteros.infoCorta());
        JOptionPane.showMessageDialog(null,viaje.infoLarga());
    }
}

class Libro{
    public static final int TAMANYO_MINIMO_PARA_SER_TOCHO = 500;
    private final String titulo;
    private final String autor;
    private final int numeroPaginas;
    private final String genero;
    private final String sinopsis;
    private boolean esTocho;

    Libro(String titulo,String autor, int numeroPaginas,String genero,String sinopsis){
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
        this.genero=genero;
        this.sinopsis=sinopsis;
        this.esTocho=numeroPaginas>TAMANYO_MINIMO_PARA_SER_TOCHO;
    }

    public boolean esTocho(){
        return esTocho;
    }

    public String infoCorta(){
            String salida="";
            salida+=String.format("%10s - %40s%n","Título",titulo);
            salida+=String.format("%10s - %40s%n","Autor",autor);
            salida+=String.format("%10s%n",esTocho?"Es tocho":"Ligerillo");
            return salida;
    }

    public String infoLarga(){
        String salida="";
        salida+="************** LIBRO ***************\n";
        salida+=this.infoCorta();
        salida+=this.genero+"\n";
        salida+=this.sinopsis+"\n";
        return salida;
    }




    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public String getGenero(){
        return genero;
    }
    public String getSinopsis(){
        return sinopsis;
    }

}
/*
    Crear una clase Libro con los siguientes atributos:

        Título
        Autor
        Número de páginas
        Género
        Sinopsis
        Crear los setters y los getters  y un programa de
        prueba que cree los siguientes libros




Además de crear esos libros, el programa deberá mostrar la información
del título y el autor y deberá decir si el libro es un "tocho"
(un libro es un tocho cuando tiene más de 500 páginas) de la forma
Es un "tocho":true

Después el usuario debe introducir la información de un libro
que se debe crear para después mostrar la misma información que
para los libros anteriores.
*/