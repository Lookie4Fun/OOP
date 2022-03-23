package Practicum8;

abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    public boolean equals(Object obj){
        boolean d = false;
        if (obj instanceof Voertuig){
            Voertuig a = (Voertuig) obj;
            if(a.type.equals(type) && a.nieuwprijs == nieuwprijs &&a.bouwjaar == bouwjaar){
               d = true;
            }
        }
        return d;
    }

    public String toString(){
        return "Voertuig: "+ type +" met bouwjaar "+bouwjaar+" heeft een waarde van: €"+Utils.euroBedrag(huidigeWaarde(),2);
    }
}
