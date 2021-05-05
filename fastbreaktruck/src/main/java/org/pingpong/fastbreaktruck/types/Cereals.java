package org.pingpong.fastbreaktruck.types;

import org.pingpong.fastbreaktruck.behaviour.Item;
import org.pingpong.fastbreaktruck.behaviour.Packing;
import org.pingpong.fastbreaktruck.domain.Box;

public abstract class Cereals implements Item {
    @Override
    public Packing packaging() {
        return new Box();
    }

    @Override
    public String toString() {
        return this.outputFormatter();
    }
}
