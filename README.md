# Factory Method Demo Application

This is a simple Java application demonstrating the Factory Method design pattern. The application is built using Spring Boot and Maven.

## Overview

The application simulates a logistics system where different types of logistics (Road, Sea, and Air) create different types of transport (Truck, Ship, and Airplane) respectively. The Factory Method design pattern is used to handle the creation of these transport objects.

## Structure

The application is structured into two main packages:

1. `SWEN656AGcom.example.factoryMethodDemo`: This package contains the main application class `FactoryMethodDemoApplication.java` which is the entry point of the Spring Boot application.

2. `SWEN656AGcom.example.factoryMethodDemo.logistics`: This package contains the abstract `Logistics` class and its subclasses `RoadLogistics`, `SeaLogistics`, and `AirLogistics`. Each subclass overrides the `createTransport()` method from the `Logistics` class to create a specific type of transport.

## Testing

The application includes a test suite `FactoryMethodDemoApplicationTests.java` in the `SWEN656AGcom.example.factoryMethodDemo` package. The test suite contains tests to verify that each type of logistics creates the correct type of transport.

## Running the Application

To run the application, use the following command in the terminal:

```bash
mvn spring-boot:run
```

## Running the Tests

To run the tests, use the following command in the terminal:

```bash
mvn test
```

## Requirements

- Java 8 or higher
- Maven 3.6.0 or higher

## Contributing

Please read `CONTRIBUTING.md` for details on our code of conduct, and the process for submitting pull requests to us.

## License

This project is licensed under the MIT License - see the `LICENSE.md` file for details.