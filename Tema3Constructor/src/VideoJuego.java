public class VideoJuego {
    public static final char SIMBOLO_VALORACION_BUENA='\u2605';
    public static final char SIMBOLO_VALORACION_MALA='\u2606';


    private final String titulo;
    private final String descripcion;
    private boolean disponiblePS4;
    private boolean disponibleXBOX;
    private boolean disponiblePC;
    private final int anyoLanzamiento;
    private int valoracion;
    private int precio;
    private boolean estaDeOferta;
    private int porcentajeOferta;

    public String getTitulo(){
        return titulo.toUpperCase();
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getAnyoLanzamiento(){
        return anyoLanzamiento;
    }

    public void setValoracion(int valoracion){
        this.valoracion=valoracion;
    }

    public int getValoracion() {
        return valoracion;
    }

    public String getValoracionEstrellas(){
        String salida="";
        salida+=valoracion==1?
                ""+SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_MALA+
                SIMBOLO_VALORACION_MALA+
                SIMBOLO_VALORACION_MALA+
                SIMBOLO_VALORACION_MALA
                :"";
        salida+=valoracion==2?
                ""+SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_MALA+
                SIMBOLO_VALORACION_MALA+
                SIMBOLO_VALORACION_MALA
                :"";
        salida+=valoracion==3?
                ""+SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_MALA+
                SIMBOLO_VALORACION_MALA
                :"";
        salida+=valoracion==4?
                ""+SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_MALA
                :"";
        salida+=valoracion==5?
                ""+SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA+
                SIMBOLO_VALORACION_BUENA
                :"";

        return salida;
    }


    public VideoJuego(String titulo,String descripcion, int anyoLanzamiento,int precio){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.anyoLanzamiento=anyoLanzamiento;
        this.precio=precio;
    }
    public String infoRapida(){
        String salida="";
        salida+=this.titulo;
        salida+=" "+this.getValoracionEstrellas()+" ";
        salida+=" Precio: "+this.precio+" centimos de €";
        return salida;
    }

    public void diponiblePS4(){
        disponiblePC=false;
        disponibleXBOX=false;
        disponiblePS4=true;
    }
    public void diponiblePC(){
        disponiblePC=true;
        disponibleXBOX=false;
        disponiblePS4=false;
    }
    public void diponibleXBOX(){
        disponiblePC=false;
        disponibleXBOX=true;
        disponiblePS4=false;
    }
    public void diponiblePS4XBOX(){
        disponiblePC=false;
        disponibleXBOX=true;
        disponiblePS4=true;
    }
    public void diponiblePS4PC(){
        disponiblePC=true;
        disponibleXBOX=false;
        disponiblePS4=true;
    }
    public void diponibleXBOXPC(){
        disponiblePC=true;
        disponibleXBOX=true;
        disponiblePS4=false;
    }
    public void diponiblePS4XBOXPC(){
        disponiblePC=true;
        disponibleXBOX=true;
        disponiblePS4=true;
    }

}
