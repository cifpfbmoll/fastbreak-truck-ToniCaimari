package org.pingpong.fastbreaktruck;

import org.pingpong.fastbreaktruck.behaviour.FastBreakTruck;
import org.pingpong.fastbreaktruck.domain.Breakfast;

/**
 * Unit test for simple App.
 */
public class App {

    public static void main(String[] args) {

        Breakfast eyeDes = FastBreakTruck.prepareEyeHoles();

        System.out.println("\nNo abras la caja de Eyeholes!");
        eyeDes.showItems();
        System.out.print("Precio pedido: " + eyeDes.getCost());

        /**
         * Desayuno Smiggles
         */

        Breakfast smigDes = FastBreakTruck.prepareSmiggles();
        System.out.println("\nSmiggles per als nins!");
        smigDes.showItems();
        System.out.print("Precio pedido: " + smigDes.getCost());

        /**
         * Plumbus
         */

        eyeDes = FastBreakTruck.prepareEyeHoles();
        FastBreakTruck.addToy(eyeDes);
        System.out.println("\nEyeholes con plumbus!");
        eyeDes.showItems();
        System.out.print("Precio pedido: " + eyeDes.getCost());
    }
}