public class Persona {

    private static String tratamiento="Sr./Sra.";

    private final String nombre;
    private final String apellidos;

    Persona(String nombre,String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    public String encabezadoCarta(){
        return "\t"+tratamiento+this.apellidos+", "+this.nombre;
    }

    private static void cambiaTratamiento(String tratamiento){
        Persona.tratamiento=tratamiento;
    }

    public static void enIngles(){
        Persona.cambiaTratamiento("Mr./Ms.");
    }

    public static void enEspanyol(){
        Persona.cambiaTratamiento("Sr./Sra.");
    }

}
