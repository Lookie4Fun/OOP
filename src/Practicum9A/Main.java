package Practicum9A;

public class Main {
    public static void main(String[] arg){
        double bedrag1 = 1123.5672245;
        System.out.println("Zonder precisie:"+Utils.euroBedrag(bedrag1));
        System.out.println("Met precisie:"+Utils.euroBedrag(bedrag1,1));

        double bedrag2 = 98769.5;
        System.out.println("Zonder precisie:"+Utils.euroBedrag(bedrag2));
        System.out.println("Met precisie:"+Utils.euroBedrag(bedrag2,1));

        double bedrag3 = 234.455;
        System.out.println("Zonder precisie:"+Utils.euroBedrag(bedrag3));
        System.out.println("Met precisie:"+Utils.euroBedrag(bedrag3,1));
    }
}
