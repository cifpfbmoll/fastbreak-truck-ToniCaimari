package org.pingpong.fastbreaktruck;

import static org.junit.Assert.assertEquals;
import org.pingpong.fastbreaktruck.domain.FleebJuice;
import org.junit.Test;

public class FleebJuiceTest {

    private FleebJuice fleebJuice = new FleebJuice();

    @Test
    public void testGetters() {
        assertEquals("FleebJuice", fleebJuice.name());
        assertEquals(35, fleebJuice.pvp(), 0.035);
    }
}