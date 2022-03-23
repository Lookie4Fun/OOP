package Practicum8;

public class Main {
    public static void main(String[] arg){
        BedrijfsInventaris b1 = new BedrijfsInventaris("Superkoop",500000.00);
        Computer c1 = new Computer("Dell", "7ab0.ae64.2979.", 700.00, 2007);
        Computer c2 = new Computer("Dell", "7ab0.ae64.2979.", 700.00, 2007);
        Computer c3 = new Computer("Lenovo", "13cv0.feb4.2345.", 1249.99,2020);
        Auto a1 = new Auto("Volkswagen", 9000.00, 1999, "69-LK-KR");
        Auto a2 = new Auto("Volkswagen", 9000.00, 1999, "69-LK-KR");
        Auto a3 = new Auto("Audi", 30000.00, 2016, "80-OB-YS");
        Fiets f1 = new Fiets("Stella", 1500.00,2020, 123);
        Fiets f2 = new Fiets("Stella", 1500.00,2020, 123);
        Fiets f3 = new Fiets("Gazelle", 2000.00, 2017, 168);

        b1.schafAan(c1);
        b1.schafAan(c2);
        b1.schafAan(c3);
        b1.schafAan(a1);
        b1.schafAan(a2);
        b1.schafAan(a3);
        b1.schafAan(f1);
        b1.schafAan(f2);
        b1.schafAan(f3);

        System.out.println("\nb1: " +b1);

    }
}
