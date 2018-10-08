public class Pais {
    private final String nombre;
    private final int superficie;
    private final double poblacion;
    private final double densidad;
    private final double variacion9095;
    private final double rural;
    private final int pib;
    private final boolean esValidoElPIB;
    private final double tasaRealCrecimiento;
    private final boolean esValidaLaTasa;

    public Pais(String nombre, int superficie, double poblacion, double densidad, double variacion9095, double rural, int pib, boolean esValidoElPIB, double tasaRealCrecimiento, boolean esValidaLaTasa) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.poblacion = poblacion;
        this.densidad = densidad;
        this.variacion9095 = variacion9095;
        this.rural = rural;
        this.pib = pib;
        this.esValidoElPIB = esValidoElPIB;
        this.tasaRealCrecimiento = tasaRealCrecimiento;
        this.esValidaLaTasa = esValidaLaTasa;
    }

    public String informacion(){
        String salida="";
        salida+=nombre+'\n';
        salida+="Superficie:       "+String.format("%7d miles de hectáreas%n",superficie);
        salida+="Población:        "+String.format("%10.2f millones%n",poblacion);
        salida+="Variación:        "+String.format("%10.2f %%%n",variacion9095);
        salida+="Población rural:  "+String.format("%10.2f %%%n",rural);

        String salidaParaPIB="PNB per cápita:   ";
        salidaParaPIB+=esValidoElPIB?String.format("%7d $%n",pib):"   N/A\n";
        salida+=salidaParaPIB;
        String salidaParaTasa="Tasa de Crecim.:  ";
        salidaParaTasa+=esValidaLaTasa?String.format("%10.2f %%%n",rural):"   N/A\n";
        salida+=salidaParaTasa;

        return salida;
    }
    public String informacionHTML(){
        String salida="<html><body style=\"background-color:#00FFCC;\"><p style=\"font-size:24px; color:#FF0000;\">";
        salida+=nombre+"</p><br><pre>";
        salida+="Superficie:       "+String.format("%7d miles de hectáreas<br>",superficie);
        salida+="Población:        "+String.format("%10.2f millones<br>",poblacion);
        salida+="Variación:        "+String.format("%10.2f %%<br>",variacion9095);
        salida+="Población rural:  "+String.format("%10.2f %%<br>",rural);

        String salidaParaPIB="PNB per cápita:   ";
        salidaParaPIB+=esValidoElPIB?String.format("%7d $<br>",pib):"   N/A<br>";
        salida+=salidaParaPIB;
        String salidaParaTasa="Tasa de Crecim.:  ";
        salidaParaTasa+=esValidaLaTasa?String.format("%10.2f %%<br>",rural):"   N/A<br>";
        salida+=salidaParaTasa;

        return salida;
    }
}
