public class PasoPorValor {

    static void doblaEdad(Persona p){
//        p=new Persona();
        p.setNombre("Bea");
        p.setEdad(40);
    }

    public static void main(String[] args) {
        int n=13;
        doble(n);
        System.out.println(n);
        Persona p=new Persona();
        p.setNombre("Ana");
        p.setEdad(20);
        doblaEdad(p);
        System.out.println(p);
    }


    private static void doble(int n) {
        n=n*2;
    }

    static class Persona{
        //Getter y Setter típico
        String nombre;
        int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }

}
