package org.pingpong.fastbreaktruck.behaviour;

import java.util.Formatter;

public interface Item {
    String name();

    Packing packaging();

    Float pvp();

    default String outputFormatter() {

        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);

        formatter.format("Item: %1$s, Package: %2$s, Price: %3$s %n", this.name(), this.packaging().wrapper(),
                this.pvp());

        formatter.close();
        return stringBuilder.toString();
    }
}
