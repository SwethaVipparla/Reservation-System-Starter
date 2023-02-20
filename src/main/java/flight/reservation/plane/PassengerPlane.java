package flight.reservation.plane;

public class PassengerPlane {
    private String model;
    private int passengerCapacity;
    private int crewCapacity;

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }
}
