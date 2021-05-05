package org.pingpong.fastbreaktruck.behaviour;

import org.pingpong.fastbreaktruck.domain.Breakfast;
import org.pingpong.fastbreaktruck.domain.Eyeholes;
import org.pingpong.fastbreaktruck.domain.FleebJuice;
import org.pingpong.fastbreaktruck.domain.Plumbus;
import org.pingpong.fastbreaktruck.domain.Smiggles;
import org.pingpong.fastbreaktruck.domain.TurbulentJuice;

public class FastBreakTruck {
    public static Breakfast prepareEyeHoles() {
        Breakfast breakfast = new Breakfast();
        breakfast.addItem(new Eyeholes());
        breakfast.addItem(new TurbulentJuice());
        return breakfast;
    }

    public static Breakfast prepareSmiggles() {
        Breakfast breakfast = new Breakfast();
        breakfast.addItem(new Smiggles());
        breakfast.addItem(new FleebJuice());
        return breakfast;
    }

    public static void addToy(Breakfast breakfast) {
        breakfast.addItem(new Plumbus());
    }
}
