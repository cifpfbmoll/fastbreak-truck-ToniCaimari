package org.pingpong.fastbreaktruck;

import static org.junit.Assert.assertEquals;
import org.pingpong.fastbreaktruck.domain.Eyeholes;

import org.junit.Test;

public class EyeholesTest {

    private Eyeholes eyeholes = new Eyeholes();

    @Test
    public void testGetters() {
        assertEquals("Eyeholes", eyeholes.name());
        assertEquals(25, eyeholes.pvp(), 0.025);
    }
}