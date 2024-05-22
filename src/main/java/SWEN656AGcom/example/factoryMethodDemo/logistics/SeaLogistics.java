package SWEN656AGcom.example.factoryMethodDemo.logistics;

import SWEN656AGcom.example.factoryMethodDemo.transport.Ship;

/**
 * SeaLogistics class extending the abstract Logistics class.
 * Creates a Ship object for sea delivery.
 */
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
