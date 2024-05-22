package SWEN656AGcom.example.factoryMethodDemo;

import SWEN656AGcom.example.factoryMethodDemo.logistics.*;
import SWEN656AGcom.example.factoryMethodDemo.transport.Airplane;
import SWEN656AGcom.example.factoryMethodDemo.transport.Ship;
import SWEN656AGcom.example.factoryMethodDemo.transport.Truck;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class FactoryMethodDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testRoadLogistics() {
		Logistics logistics = new RoadLogistics();
		Transport transport = logistics.createTransport();
		assertTrue(transport instanceof Truck, "Expected transport to be an instance of Truck");
	}

	@Test
	void testSeaLogistics() {
		Logistics logistics = new SeaLogistics();
		Transport transport = logistics.createTransport();
		assertTrue(transport instanceof Ship, "Expected transport to be an instance of Ship");
	}

	@Test
	void testAirLogistics() {
		Logistics logistics = new AirLogistics();
		Transport transport = logistics.createTransport();
		assertTrue(transport instanceof Airplane, "Expected transport to be an instance of Airplane");
	}

}
