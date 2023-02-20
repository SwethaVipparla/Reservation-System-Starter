package flight.reservation.plane.interfaces;

public interface Builder {
    public void reset();
    public void setModel(String model);
    public void setPassengerCapacity(int passengerCapacity);
    public void setCrewCapacity(int crewCapacity);
}