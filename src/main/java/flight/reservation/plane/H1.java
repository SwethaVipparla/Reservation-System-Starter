package flight.reservation.plane;

public class H1 implements Helicopter {
    private final int passengerCapacity = 4;

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String getModel() {
        return "H1";
    }
}