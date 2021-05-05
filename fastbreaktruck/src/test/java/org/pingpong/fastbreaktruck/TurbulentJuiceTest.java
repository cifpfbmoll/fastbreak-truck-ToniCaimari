package org.pingpong.fastbreaktruck;

import static org.junit.Assert.assertEquals;
import org.pingpong.fastbreaktruck.domain.TurbulentJuice;
import org.junit.Test;

public class TurbulentJuiceTest {

    private TurbulentJuice fleebJuice = new TurbulentJuice();

    @Test
    public void testGetters() {
        assertEquals("TurbulentJuice", fleebJuice.name());
        assertEquals(30, fleebJuice.pvp(), 0.030);
    }
}