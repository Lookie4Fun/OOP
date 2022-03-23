package Practicum8;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr,double pr, int jr){
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    public double huidigeWaarde(){
        double waarde = aanschafPrijs;
        int jaaroud = LocalDate.now().getYear() - productieJaar;
        while(jaaroud > 0){
            double waardedaling = waarde/100*40;
            waarde = waarde - waardedaling;
            jaaroud --;
        }
        return waarde;
    }

    public boolean equals(Object obj){
        boolean d = false;
        if (obj instanceof Computer){
            Computer a = (Computer) obj;
            if(a.type.equals(type) && a.macAdres.equals(macAdres) && a.aanschafPrijs == aanschafPrijs && a.productieJaar == productieJaar){
                d = true;
            }
        }
        return d;
    }

    public String toString(){
        return "Computer: "+type+" met productieJaar "+productieJaar+" heeft een waarde van: €"+huidigeWaarde();
    }
}
