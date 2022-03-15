package Practicum7;

public class KleineLetterProces implements OpmaakProces {
    public KleineLetterProces(){
    }

    public String maakOp(String input){
        input = input.toLowerCase();
        return  input;
    }
}