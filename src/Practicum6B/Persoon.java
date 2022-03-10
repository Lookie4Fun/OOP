package Practicum6B;

import Practicum5.Leerling;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> Games;
    private ArrayList<Game> teKoop;
    private ArrayList<Game> nogNietInBezit;

    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget =bud;
        Games = new ArrayList<Game>();
        nogNietInBezit = new ArrayList<Game>();
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

    public Game zoekGameOpNaam(String game) {
        Game r = null;
        for(Game g : Games){
            if(g.equals(game)){
                r = g;
            }
        }
        return r;
    }
    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> teKoop) {
        for(Game tk: teKoop) {
            if (!Games.contains(tk)) {
                nogNietInBezit.add(tk);
            }
        }
        return nogNietInBezit;
    }

    public String toString(){
        String b= naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";
        for(Game g : Games){
            b=b+g;
        }
        return b + "\n";
    }
}
