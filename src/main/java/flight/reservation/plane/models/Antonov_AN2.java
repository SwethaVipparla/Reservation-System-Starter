package flight.reservation.plane.models;

import flight.reservation.plane.interfaces.PassengerPlane;

public class Antonov_AN2 implements PassengerPlane{
    private final static String model = "Antonov AN2";
    private final static int passengerCapacity = 15;
    private final static int crewCapacity = 3;

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