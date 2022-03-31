package Practicum11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TekstSchrijvenNaarFile {
    public static void main(String[] arg) throws IOException {
        String bronbestand = "TekstBestand.txt";
        String bestemmingbestand = "BestemmingsBestand.txt" ;
        double eenUsDollarinEuroCent = 0.91;

        Path lezen = Path.of("C:\\Users\\Nick\\IdeaProjects\\OOP\\OOP Practicum Opdrachten\\src\\Practicum11\\"+bronbestand);
        List<String> alleRegels = Files.readAllLines(lezen);

        Path schrijven = Path.of("C:\\Users\\Nick\\IdeaProjects\\OOP\\OOP Practicum Opdrachten\\src\\Practicum11\\"+bestemmingbestand);
        BufferedWriter out = Files.newBufferedWriter(schrijven);

        for(String regel : alleRegels){
            String[] deel = regel.split(":");
            String geldregel = deel[1]; // 034556
            double dollar = Double.parseDouble(geldregel);
            regel.split(":");
            double naarEuro = dollar * eenUsDollarinEuroCent;

            out.newLine();
            out.write(deel[0]+":"+String.format("%.2f",naarEuro));

        }
        out.close();
    }
}
