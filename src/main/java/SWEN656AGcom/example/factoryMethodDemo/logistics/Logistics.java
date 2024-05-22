package SWEN656AGcom.example.factoryMethodDemo.logistics;

import SWEN656AGcom.example.factoryMethodDemo.logistics.Transport;

/**
 * Abstract Logistics class defining the factory method for creating Transport objects.
 */
public abstract class Logistics {
    /**
     * Factory method to create a Transport object.
     * @return Transport object
     */
    public abstract Transport createTransport();

    /**
     * Plan the delivery using the created Transport object.
     */
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

}
