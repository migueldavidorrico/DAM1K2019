import javax.swing.*;

public class Fao {
    public static void main(String[] args) {
        Pais p=new Pais(
                "Omán",
                21246,
                2.2,
                10.2,
                4.2,
                86.8,
                5600,
                true,
                1.2,
                true
        );
        System.out.println(p.informacion());
        System.out.println("---------------------------------------------------");
        Pais p2=new Pais(
                "Macedonia",
                2543,
                2.2,
                85.1,
                1.1,
                40.1,
                780,
                true,
                0,
                false
        );

        System.out.println(p2.informacion());
        System.out.println("---------------------------------------------------");

        Pais p3=new Pais(
                "Antillas Neerlandesas",
                80,
                0.2,
                248.8,
                0.9,
                30.7,
                0,
                false,
                0,
                false
        );
        System.out.println(p3.informacion());
        JOptionPane.showMessageDialog(null,p.informacionHTML());
    }
}
