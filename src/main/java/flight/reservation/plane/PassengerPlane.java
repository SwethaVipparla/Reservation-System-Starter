package flight.reservation.plane;

public class PassengerPlane {

    public String model;
    public int passengerCapacity;
    public int crewCapacity;

    public PassengerPlane(String model) {

        // this.model = model;
        // switch (model) {
        // case "A380":
        // return
        // break;
        // case "A350":
        // passengerCapacity = 320;
        // crewCapacity = 40;
        // break;
        // case "Embraer 190":
        // passengerCapacity = 25;
        // crewCapacity = 5;
        // break;
        // case "Antonov AN2":
        // passengerCapacity = 15;
        // crewCapacity = 3;
        // break;
        // default:
        passengerPlaneFactory(model);

    }

    public PassengerPlaneInterface passengerPlaneFactory(String model) {
        switch (model) {
            case "A380":
                return new A380();
            case "A350":
                return new A350();
            case "Embraer 190":
                return new Embraer190();
            case "Antonov AN2":
                return new AntonovAN2();
            default:
                throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }
}
