package SWEN656AGcom.example.factoryMethodDemo.transport;

import SWEN656AGcom.example.factoryMethodDemo.logistics.Transport;

/**
 * Truck class implementing the Transport interface.
 * Represents delivery by land using a truck.
 */
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
