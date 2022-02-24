package Practicum2A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {
    Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
    @Test
    void testBerekendeinhoud(){
        assertEquals(16.5, z1.inhoud(),"de inhoud wordt verkeerd berekend");

    }
}