public class EscaleraNumerica {
    public static void main(String[] args) {
        int numero=23;
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }

}

/*
        Crea una aplicación que dibuje una escalera de números, siendo cada línea números empezando en uno y acabando en el número de la línea. Este es un ejemplo, si introducimos un 5 como altura:
        1
        12
        123
        1234
        12345*/