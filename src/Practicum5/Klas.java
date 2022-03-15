package Practicum5;

import java.util.ArrayList;

public class Klas {
    private String klascode;
    private ArrayList<Leerling> Leerlingen;

    public Klas(String kC){
        this.klascode=kC;
        Leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l){
        Leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for(Leerling l: Leerlingen){
            if(nm.equals(l.getNaam())){
                l.setCijfer(nweCijfer);
                break;
            }
        }
    }

    public ArrayList getLeerlingen(){
        return Leerlingen;
    }

    public int aantalLeerlingen(){
        return Leerlingen.size();
    }

    public String toString() {
        String b = "In klas " + klascode + " zitten de volgende leerlingen:";
        for (Leerling i : Leerlingen) {
            b=b+i;
        }
        return b+ "\n";
    }
}
