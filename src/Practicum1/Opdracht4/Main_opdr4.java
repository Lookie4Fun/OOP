package Practicum1.Opdracht4;

public class Main_opdr4 {
    public static void main(String[] arg){
        int getal = 1;
        int som = 0;
        while (getal < 40) {
            int antw = som + getal;
            System.out.println(antw);
            som = antw;
            getal++;
        }
    }
}
