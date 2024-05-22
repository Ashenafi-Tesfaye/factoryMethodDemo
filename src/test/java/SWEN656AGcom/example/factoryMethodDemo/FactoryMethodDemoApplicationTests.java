package SWEN656AGcom.example.factoryMethodDemo;

import SWEN656AGcom.example.factoryMethodDemo.logistics.*;
import SWEN656AGcom.example.factoryMethodDemo.transport.Airplane;
import SWEN656AGcom.example.factoryMethodDemo.transport.Ship;
import SWEN656AGcom.example.factoryMethodDemo.transport.Truck;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Spring Boot Test class for the Factory Method design pattern implementation.
 */
@SpringBootTest
class FactoryMethodDemoApplicationTests {

	@Test
	void contextLoads() {
		// Test to check if the Spring Application context loads successfully.
	}

	@Test
	void testRoadLogistics() {
		// Test to verify that RoadLogistics creates a Truck transport.
		Logistics logistics = new RoadLogistics();
		Transport transport = logistics.createTransport();
		assertTrue(transport instanceof Truck, "Expected transport to be an instance of Truck");
	}

	@Test
	void testSeaLogistics() {
		// Test to verify that SeaLogistics creates a Ship transport.
		Logistics logistics = new SeaLogistics();
		Transport transport = logistics.createTransport();
		assertTrue(transport instanceof Ship, "Expected transport to be an instance of Ship");
	}

	@Test
	void testAirLogistics() {
		// Test to verify that AirLogistics creates an Airplane transport.
		Logistics logistics = new AirLogistics();
		Transport transport = logistics.createTransport();
		assertTrue(transport instanceof Airplane, "Expected transport to be an instance of Airplane");
	}

}
