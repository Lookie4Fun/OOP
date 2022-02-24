package Practicum3B;

public class Cirkel {

    private int radius;
    private int xPositie;
    private int yPositie;
    public Cirkel(int  radius, int xPositie, int yPositie){
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;

        if( radius <= 0){ throw new IllegalArgumentException ("Radius moet groter dan 0 zijn!");
        }
    }

    public String toString(){
        return "cirkel ( " + xPositie + " , " + yPositie + ") met radius: " + radius;
    }

}
