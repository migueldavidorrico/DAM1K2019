public class Tabla {
    private static final String STYLE_CELDA_GENERAL =
            "border:1px black solid;" +
            "width:50px;height:50px;"+
            "vertical-align:center;"+
            "text-align:center;" +
            "font-size:20px;" +
            "font-family:Courier;";
    private static final String STYLE_PAR =
            "background-color:#333333;"+
            "color:#CCCCCC";
    private static final String STYLE_IMPAR =
            "background-color:#CCCCCC;"+
                    "color:#333333";
    private int numeroFinal;
    private int columnas;

    public Tabla(int numeroFinal) {
        this.numeroFinal=numeroFinal;
        this.columnas=(int)Math.sqrt(numeroFinal);
    }


    public String cadenaHTMLTabla(){
        String salida="<html><table style=\"border-spacing:-1px;\"><tr>";
        int espaciosCelda=(""+this.numeroFinal).length()+1;
        int numeroActual=1;
        boolean estiloPar=true;
        while(numeroActual<=this.numeroFinal){
            String estiloParImpar;
            if(estiloPar){
                estiloParImpar=STYLE_PAR;
                estiloPar=false;
            } else {
                estiloParImpar=STYLE_IMPAR;
                estiloPar=true;
            }
            salida+="<td style=\""+STYLE_CELDA_GENERAL+estiloParImpar+"\">"+numeroActual+"</td>";
            if(numeroActual%columnas==0){
                salida+="</tr><tr>";
                if(columnas%2==0)estiloPar=!estiloPar;

            }
            numeroActual++;
        }
        return salida+"</tr></table></html>";
    }

    public String cadenaTabla() {
        String salida="";
        int espaciosCelda=(""+this.numeroFinal).length()+1;
        int numeroActual=1;
        while(numeroActual<=this.numeroFinal){
            salida+=String.format("%"+espaciosCelda+"s",numeroActual);
            if(numeroActual%columnas==0){
                salida+="\n";
            }
            numeroActual++;
        }
        return salida;
    }
}
