package org.pingpong.fastbreaktruck.domain;

import org.pingpong.fastbreaktruck.types.Cereals;

public class Smiggles extends Cereals {
    final String NAME = "Smiggles";
    final Float PVP = 50f;

    public String name() {
        return NAME;
    }

    public Float pvp() {
        return PVP;
    }
}
