package Practicum8;

import Practicum6A.Game;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud){
        this.bedrijfsnaam = nm;
        this.budget = bud;
        alleGoederen = new ArrayList<Goed>();
    }

    public void schafAan(Goed g){
        if(!alleGoederen.contains(g) && budget >= g.huidigeWaarde()){
            alleGoederen.add(g);
            budget = budget-g.huidigeWaarde();
        }
    }

    public String toString(){
        String b = bedrijfsnaam + " heeft een budget van €" + String.format("%.2f", budget) + " en heeft de volgende goederen in het inventaris:";
        for(Goed g : alleGoederen){
            b=b+"\n"+g;
        }
        return b ;
    }
}
