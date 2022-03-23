package Practicum8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BedrijfsInventarisTest {
    static Computer c1, c2, c3;
    static Auto a1, a2, a3;
    static Fiets f1, f2, f3;

    @BeforeEach
    public void initialize() {

        try {
            c1 = new Computer("Dell", "7ab0.ae64.2979.", 700.00, 2007);
            c2 = new Computer("Dell", "7ab0.ae64.2979.", 700.00, 2007);
            c3 = new Computer("Lenovo", "13cv0.feb4.2345.", 1249.99, 2020);
            a1 = new Auto("Volkswagen", 9000.00, 1999, "69-LK-KR");
            a2 = new Auto("Volkswagen", 9000.00, 1999, "69-LK-KR");
            a3 = new Auto("Audi", 30000.00, 2016, "80-OB-YS");
            f1 = new Fiets("Stella", 1500.00, 2020, 123);
            f2 = new Fiets("Stella", 1500.00, 2020, 123);
            f3 = new Fiets("Gazelle", 2000.00, 2017, 168);
        } catch (Exception e) {
            String errorMessage = "Exception: " + e.getMessage();
            System.out.println(errorMessage);
        }
    }


    @Test
    public void testEenVanDeTweeZelfdeObjectenWordAangeschaft_True() {
        BedrijfsInventaris b1 = new BedrijfsInventaris("Superkoop", 500000.00);

        try {
            b1.schafAan(c1);
            b1.schafAan(c2);
            assertEquals("Superkoop heeft een budget van €499999,67 en heeft de volgende goederen in het inventaris:\n" +
                    "Computer: Dell met productieJaar 2007 heeft een waarde van: €0.3291294892032", b1.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testAanschaffenMisluktBijOnvoldoendeBudget_True() {
        BedrijfsInventaris b1 = new BedrijfsInventaris("Superkoop", 5);

        try {
            b1.schafAan(c3);
            assertEquals("Superkoop heeft een budget van €5,00 en heeft de volgende goederen in het inventaris:", b1.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testBerekenHuidigeWaardebijAutoIsCorrect_() {
        BedrijfsInventaris b1 = new BedrijfsInventaris("Superkoop", 50000.00);

        try {
            b1.schafAan(a3);
            assertEquals("Superkoop heeft een budget van €46470,53 en heeft de volgende goederen in het inventaris:\n" +
                    "Voertuig: Audi met bouwjaar 2016 heeft een waarde van: €3529.4700000000003", b1.toString());
            assertEquals(3529.4700000000003,a3.huidigeWaarde() );
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}