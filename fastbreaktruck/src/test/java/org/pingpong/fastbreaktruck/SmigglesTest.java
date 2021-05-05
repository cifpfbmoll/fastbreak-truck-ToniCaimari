package org.pingpong.fastbreaktruck;

import static org.junit.Assert.assertEquals;
import org.pingpong.fastbreaktruck.domain.Smiggles;

import org.junit.Test;

public class SmigglesTest {

    private Smiggles eyeholes = new Smiggles();

    @Test
    public void testGetters() {
        assertEquals("Smiggles", eyeholes.name());
        assertEquals(50, eyeholes.pvp(), 0.050);
    }
}
