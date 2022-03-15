package Practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen;

    public StringProcessor(){
        processen = new ArrayList<OpmaakProces>();
    }

    public String verwerk(String input){
        for( OpmaakProces i : processen){
            input = (i).maakOp(input);


        }
        return input;

    }

    public void voegProcesToe( OpmaakProces proces){
        processen.add(proces);

    }
}
