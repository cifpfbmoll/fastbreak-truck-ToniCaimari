package org.pingpong.fastbreaktruck.domain;

import org.pingpong.fastbreaktruck.types.Drink;

public class FleebJuice extends Drink {

    final String NAME = "FleebJuice";
    final Float PVP = 35f;

    public String name() {
        return this.NAME;
    }

    public Float pvp() {
        return this.PVP;
    }
}
