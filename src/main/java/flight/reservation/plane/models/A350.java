package flight.reservation.plane.models;

import flight.reservation.plane.interfaces.PassengerPlane;

public class A350 implements PassengerPlane {
    private final static String model = "A350";
    private final static int passengerCapacity = 320;
    private final static int crewCapacity = 40;

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