package Practicum4B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    AutoHuur ah1 = new AutoHuur();
    Klant k = new Klant("Mijnheer de Vries");
    Auto a1 = new Auto("Peugeot 207", 50);

    @Test
    void testHuurderMetKortingMetAuto() {
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        k.setKorting(10.0);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +"op de naam van: Mijnheer de Vries (korting: 10.0%)\n" + "aantal dagen: 0 en dat kost 0.0",ah1.toString(),"iets is anders" );
    }
    @Test
    void testHuurderMetKortingZonderAuto() {
        ah1.setHuurder(k);
        k.setKorting(10.0);
        assertEquals("er is geen auto bekend\n" + "op de naam van: Mijnheer de Vries (korting: 10.0%)\n" + "aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }
    @Test
    void testHuurderZonderKortingMetAuto() {
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" + "op de naam van: Mijnheer de Vries (korting: 0.0%)\n" + "aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }
    @Test
    void testHuurderZonderKortingZonderAuto() {
        ah1.setHuurder(k);
        assertEquals("er is geen auto bekend\n" + "op de naam van: Mijnheer de Vries (korting: 0.0%)\n" + "aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }
    @Test
    void testGeenHuurderGeenAuto() {
        assertEquals("er is geen auto bekend\n" + "er is geen huurder bekend\n" + "aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }
    @Test
    void testGeenHuurderWelAuto() {
        ah1.setGehuurdeAuto(a1);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" + "er is geen huurder bekend\n" + "aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }
    @Test
    void testWelHuurderGeenAuto() {
        ah1.setHuurder(k);
        assertEquals("er is geen auto bekend\n" + "op de naam van: Mijnheer de Vries (korting: 0.0%)\n" + "aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }
}