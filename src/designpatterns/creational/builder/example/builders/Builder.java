package designpatterns.creational.builder.example.builders;

import designpatterns.creational.builder.example.cars.CarType;
import designpatterns.creational.builder.example.components.Engine;
import designpatterns.creational.builder.example.components.GPSNavigator;
import designpatterns.creational.builder.example.components.Transmission;
import designpatterns.creational.builder.example.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
