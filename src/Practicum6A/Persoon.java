package Practicum6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> Games;

    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget =bud;
        Games = new ArrayList<Game>();
    }

    public double getBudget(){
        return budget;
    }

    public boolean koop(Game g){
        boolean d =false;
        if(!Games.contains(g)&& budget > g.huidigeWaarde()) {
            Games.add(g);
            budget = budget - g.huidigeWaarde();
            d = true;
        }
        return d;
    }

    public boolean verkoop(Game g, Persoon koper){
        boolean d = false;
        if(Games.contains(g) && koper.koop(g)){
            Games.remove(g);
            budget = budget + g.huidigeWaarde();
            d = true;
        }
        return d;
    }

    public String toString(){
        String b= naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";
        for(Game g : Games){
            b=b+g;
        }
        return b + "\n";
    }




}
