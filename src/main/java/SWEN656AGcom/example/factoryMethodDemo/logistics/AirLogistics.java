package SWEN656AGcom.example.factoryMethodDemo.logistics;

import SWEN656AGcom.example.factoryMethodDemo.transport.Airplane;

/**
 * AirLogistics class extending the abstract Logistics class.
 * Creates an Airplane object for air delivery.
 */
public class AirLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
