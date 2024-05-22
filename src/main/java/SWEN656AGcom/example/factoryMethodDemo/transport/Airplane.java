package SWEN656AGcom.example.factoryMethodDemo.transport;

import SWEN656AGcom.example.factoryMethodDemo.logistics.Transport;

/**
 * Airplane class implementing the Transport interface.
 * Represents delivery by air using an airplane.
 */
public class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by airplane");
    }
}
