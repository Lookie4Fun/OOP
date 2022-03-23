package Practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String tp,double pr, int jr, int fnr){
        super(tp,pr,jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        double waarde = nieuwprijs;
        int jaaroud = LocalDate.now().getYear() - bouwjaar;
        while(jaaroud > 0){
            double waardedaling = waarde/100*10;
            waarde = waarde - waardedaling;
            jaaroud --;
        }
        return waarde;
    }

    public boolean equals(Object obj){
        boolean d = false;
        if (obj instanceof Fiets){
            Fiets a = (Fiets) obj;
            if(a.framenummer == this.framenummer){
                d = true;
            }
        }
        return d;
    }
}
