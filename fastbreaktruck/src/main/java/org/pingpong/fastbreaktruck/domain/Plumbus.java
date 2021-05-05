package org.pingpong.fastbreaktruck.domain;

import org.pingpong.fastbreaktruck.types.Toy;

public class Plumbus extends Toy {
    final String NAME = "Plumbus";
    final Float PVP = 100f;

    public String name() {
        return NAME;
    }

    public Float pvp() {
        return PVP;
    }
}
