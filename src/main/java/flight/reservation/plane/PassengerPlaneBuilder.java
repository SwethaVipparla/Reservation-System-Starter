package flight.reservation.plane;

import flight.reservation.plane.interfaces.Builder;

public class PassengerPlaneBuilder implements Builder {
    PassengerPlane plane;

    @Override
    public void reset() {
        plane = new PassengerPlane();
    }

    @Override
    public void setModel(String model) {
        plane.setModel(model);
    }

    @Override
    public void setPassengerCapacity(int passengerCapacity) {
        plane.setPassengerCapacity(passengerCapacity);
    }

    @Override
    public void setCrewCapacity(int crewCapacity) {
        plane.setCrewCapacity(crewCapacity);
    }

    public PassengerPlane getPlane() {
        PassengerPlane product = plane;
        reset();
        return product;
    }
}