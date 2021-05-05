package org.pingpong.fastbreaktruck.types;

import org.pingpong.fastbreaktruck.behaviour.Item;
import org.pingpong.fastbreaktruck.behaviour.Packing;
import org.pingpong.fastbreaktruck.domain.Tube;

public abstract class Drink implements Item { // importante abstract!!
    @Override
    public Packing packaging() {
        return new Tube();
    };

    @Override
    public String toString() {
        return this.outputFormatter();
    }

}
