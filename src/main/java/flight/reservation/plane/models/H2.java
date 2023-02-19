package flight.reservation.plane.models;

import flight.reservation.plane.interfaces.Helicopter;

public class H2 implements Helicopter {
    private final int passengerCapacity = 6;

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String getModel() {
        return "H2";
    }
}