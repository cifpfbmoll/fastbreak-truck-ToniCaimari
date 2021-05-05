package org.pingpong.fastbreaktruck.domain;

import org.pingpong.fastbreaktruck.types.Drink;

public class TurbulentJuice extends Drink {

    final String NAME = "TurbulentJuice";
    final Float PVP = 30f;

    public String name() {
        return this.NAME;
    }

    public Float pvp() {
        return this.PVP;
    }
}
