public class Trabajador {
    private static final int SUELDO_BASE = 80000;
    private final String nombre;
    private int sueldo;

    Trabajador(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }


    Trabajador(String nombre) {
        this(nombre, SUELDO_BASE);
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    public String infoTrabajador() {
        return this.nombre.toUpperCase() + " - " + this.sueldo / 100 + "€";
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void subidaSueldo(int porcentaje) {
        this.sueldo += this.sueldo * porcentaje / 100;
    }

    //    public void setSueldo(int sueldo) {
//        this.sueldo = sueldo;
//    }
    public static void main(String[] args) {
        Trabajador t=new Trabajador("Ana");
        System.out.println(t);
        t.sueldo=-1000;
        System.out.println(t);
    }
}
