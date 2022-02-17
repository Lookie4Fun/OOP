package Practicum2B;
public class Voetbalclub {
    private String club;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;
    public Voetbalclub(String cl){
        club = cl;
    }

    public void verwerkResultaat(char ch) {

        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld(){
        return  aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten(){
        int win = aantalGewonnen * 3;
        int gelijk = aantalGelijk;
        return  win + gelijk;
    }
    public String toString(){
        return club +" "+ aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " "
                + aantalPunten();
    }
}