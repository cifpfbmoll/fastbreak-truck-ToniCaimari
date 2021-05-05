package org.pingpong.fastbreaktruck.domain;

import org.pingpong.fastbreaktruck.behaviour.Packing;

public class Box implements Packing {
    @Override
    public String wrapper() {
        return "Box";
    }
}
