package org.pingpong.fastbreaktruck.domain;

import java.util.ArrayList;
import java.util.List;

import org.pingpong.fastbreaktruck.behaviour.Item;
import org.pingpong.fastbreaktruck.types.Toy;

public class Breakfast {
    private List<Item> items = new ArrayList<>();
    private float total;

    public List<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        getItems().add(item);// usar getItems para respetar el encapsulamiento
    }

    public void showItems() {
        for (Item item : getItems()) {// sigue usando getItems para el encapsulamiento(se me olvida cada vez)
            System.out.println(item);
        }
    }

    public Float getCost() {
        for (Item item : getItems()) {
            total += item.pvp();
        }
        return this.total;
    }

}
