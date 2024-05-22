package SWEN656AGcom.example.factoryMethodDemo.transport;

import SWEN656AGcom.example.factoryMethodDemo.logistics.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }
}
