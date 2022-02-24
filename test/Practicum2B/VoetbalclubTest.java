package Practicum2B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    Voetbalclub fc = new Voetbalclub(" ");
    Voetbalclub feij = new Voetbalclub("Feijenoord");
    @Test
    void testLegeNaamWordtFC() {
        assertEquals("FC 0 0 0 0 0", fc.toString(), "Naam word niet automatisch veranderd naar FC");
    }

    @Test
    void testPuntenResultaatW(){
        feij.verwerkResultaat('w');
        assertEquals(3 , feij.aantalPunten(), "win resulteert in het verkeerd aantal punten");
    }

    @Test
    void testPuntenResultaatG(){
        feij.verwerkResultaat('g');
        assertEquals(1 , feij.aantalPunten(), "gelijkspel resulteert in het verkeerd aantal punten");
    }

    @Test
    void testPuntenResultaatV(){
        feij.verwerkResultaat('v');
        assertEquals(0 , feij.aantalPunten(), "verloren resulteert in het verkeerd aantal punten");
    }

    @Test
    void testVerkeerdeInvoerTotaalPunten(){
        feij.verwerkResultaat('r');
       assertEquals(0,feij.aantalPunten(),"verkeerde invoer beinvloed het totaal aantal punten");
    }

    @Test
    void testToStringResultaatVanW(){
        feij.verwerkResultaat('w');
        assertEquals("Feijenoord 1 1 0 0 3",feij.toString(),"punten worden niet goed in de toString gezet");

    }

    @Test
    void testToStringResultaatVanG(){
        feij.verwerkResultaat('g');
        assertEquals("Feijenoord 1 0 1 0 1",feij.toString(),"punten worden niet goed in de toString gezet");

    }

    @Test
    void testToStringResultaatVanV(){
        feij.verwerkResultaat('v');
        assertEquals("Feijenoord 1 0 0 1 0",feij.toString(),"punten worden niet goed in de toString gezet");

    }

    @Test
    void testToStringResultaatVanWGV(){
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('v');
        assertEquals("Feijenoord 3 1 1 1 4",feij.toString(),"punten worden niet goed in de toString gezet");

    }

    @Test
    void testHerhaaldelijkeInvoerGenereerdDeJuisteTostringResultaat(){
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        assertEquals("Feijenoord 8 3 3 2 12",feij.toString(),"punten worden niet goed in de toString gezet");
    }
}