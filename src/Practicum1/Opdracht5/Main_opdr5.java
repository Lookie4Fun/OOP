package Practicum1.Opdracht5;

public class Main_opdr5 {
    public static void main(String[] args) {
        String s = "s";
        for (int i=1; i<11; i++) {
            System.out.println(s);
            s = "ss";
            System.out.println(s);
            if (s == "ss"){
                s = "s";
            }
        }
    }
}
