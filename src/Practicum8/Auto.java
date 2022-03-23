package Practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp,pr,jr);
        kenteken = kt;
    }

    public double huidigeWaarde() {
        double waarde = nieuwprijs;
        int jaaroud = LocalDate.now().getYear() - bouwjaar;
        while(jaaroud > 0){
            double waardedaling = waarde/100*30;
            waarde = waarde - waardedaling;
            jaaroud --;
        }
        return waarde;
    }

    public boolean equals(Object obj){
        boolean d = false;
        if (obj instanceof Auto){
            Auto a = (Auto) obj;
            if(a.kenteken.equals(this.kenteken)){
                d = true;
            }
        }
        return d;
    }
}
