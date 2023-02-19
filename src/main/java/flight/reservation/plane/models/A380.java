package flight.reservation.plane.models;

import flight.reservation.plane.interfaces.PassengerPlane;

public class A380 implements PassengerPlane {
    private final static String model = "A380";
    private final static int passengerCapacity = 500;
    private final static int crewCapacity = 42;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public int getCrewCapacity() {
        return crewCapacity;
    }
}
