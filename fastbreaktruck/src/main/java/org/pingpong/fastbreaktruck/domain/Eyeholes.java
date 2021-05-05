package org.pingpong.fastbreaktruck.domain;

import org.pingpong.fastbreaktruck.types.Cereals;

public class Eyeholes extends Cereals {
    private final String NOMBRE = "Eyeholes";
    private final Float PVP = 25f;

    @Override
    public String name() {
        return NOMBRE;
    }

    @Override
    public Float pvp() {
        return PVP;
    }
}
