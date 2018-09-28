public class GameStore {
    public static void main(String[] args) {
        VideoJuego rdr2=new VideoJuego("Red Dead Redemption II",
                "Del Oeste",
                2018,
                6995);
        System.out.println(rdr2.getTitulo());
        rdr2.setValoracion(2);
        System.out.println(rdr2.infoRapida());
        VideoJuego sottr=new VideoJuego("Shadow of the Tomb Raider",
                "Lara dando saltitos",
                2018,
                6390);
        sottr.setValoracion(5);
        System.out.println(sottr.infoRapida());
        sottr.diponiblePS4XBOXPC();
    }
}
