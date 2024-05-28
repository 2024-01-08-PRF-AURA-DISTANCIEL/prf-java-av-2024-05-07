package fr.maboite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MesTests {

    @Test
    public void testQuiMarche() {
        assertEquals(1, 1, "Ce test passe");
    }

    @Test
    public void testQuiEchoue() {
        assertEquals(1, 2, "Ce test ne passeraaa PAAAAAAS");
    }
}
