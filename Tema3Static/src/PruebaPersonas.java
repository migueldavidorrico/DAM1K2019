public class PruebaPersonas {
    public static void main(String[] args) {
        Persona ana=new Persona("Ana","López");
        Persona bea=new Persona("Bea","Gómez");
        System.out.println(ana.encabezadoCarta());
        System.out.println(bea.encabezadoCarta());
        Persona.enIngles();
        System.out.println(ana.encabezadoCarta());
        Persona.enEspanyol();
        System.out.println(bea.encabezadoCarta());
    }
}
