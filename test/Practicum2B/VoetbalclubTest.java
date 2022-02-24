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

}