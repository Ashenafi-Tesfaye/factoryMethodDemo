package SWEN656AGcom.example.factoryMethodDemo.transport;

import SWEN656AGcom.example.factoryMethodDemo.logistics.Transport;

/**
 * Ship class implementing the Transport interface.
 * Represents delivery by sea using a ship.
 */
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }
}
