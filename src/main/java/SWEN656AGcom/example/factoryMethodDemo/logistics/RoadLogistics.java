package SWEN656AGcom.example.factoryMethodDemo.logistics;

import SWEN656AGcom.example.factoryMethodDemo.transport.Truck;

/**
 * RoadLogistics class extending the abstract Logistics class.
 * Creates a Truck object for land delivery.
 */
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
