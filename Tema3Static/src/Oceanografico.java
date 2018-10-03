import javax.swing.*;

public class Oceanografico {
    public static void main(String[] args) {
        Pez p1=new Pez("Tiburón",200);
        //El tiburón crece
        p1.setTamanyo(300);
        Pez p2=new Pez("Ballena",5000);
        Pez p3=new Pez("Pez payaso",60);
        Pez p4=new Pez("Dorada",90);

        System.out.println(Pez.getNumeroPeces());
    }
}
