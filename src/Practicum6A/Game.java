package Practicum6A;
import java.time.LocalDate;

public class Game {
    private String naam;
    private int releasejaar;
    private double niewprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releasejaar = rJ;
        this.niewprijs = nwpr;
    }

    public String getnaam(){
        return naam;
    }

    public double huidigeWaarde(){
        double waarde = niewprijs;
        int jaaroud = LocalDate.now().getYear() - releasejaar;
        while(jaaroud > 0){
            double waardedaling = waarde/100*30;
            waarde = waarde - waardedaling;
            jaaroud --;
        }
        return waarde;
    }

    public boolean equals(Object andereObject) {
        boolean d = false;
        if (andereObject instanceof Game) {
            Game b = (Game) andereObject;
            if (b.getnaam().equals(this.naam) && b.releasejaar == this.releasejaar) {
                d = true;
            }
        }
        System.out.println(d);
        return d;
    }

    public String toString(){

        return naam + ", uitgegeven in "+ releasejaar+ "; "+ "nieuwprijs: €"+ String.format("%.2f",niewprijs)+ " nu voor: €"+ String.format("%.2f",huidigeWaarde()) ;
    }

}
