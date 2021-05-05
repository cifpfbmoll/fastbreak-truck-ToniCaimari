package org.pingpong.fastbreaktruck.domain;

import org.pingpong.fastbreaktruck.behaviour.Packing;

public class Tube implements Packing {
    @Override
    public String wrapper() {
        return "Tube";
    }
}
