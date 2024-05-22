package SWEN656AGcom.example.factoryMethodDemo.logistics;

import SWEN656AGcom.example.factoryMethodDemo.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
