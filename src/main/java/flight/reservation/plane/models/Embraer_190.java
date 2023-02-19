package flight.reservation.plane.models;

import flight.reservation.plane.interfaces.PassengerPlane;

public class Embraer_190 implements PassengerPlane {
    private final static String model = "Embraer 190";
    private final static int passengerCapacity = 25;
    private final static int crewCapacity = 5;

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