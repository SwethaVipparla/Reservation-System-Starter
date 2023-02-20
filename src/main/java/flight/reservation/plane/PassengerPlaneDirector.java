package flight.reservation.plane;

import flight.reservation.plane.interfaces.Builder;

public class PassengerPlaneDirector {
    public void constructA380(Builder builder) {
        builder.reset();
        builder.setModel("A380");
        builder.setPassengerCapacity(500);
        builder.setCrewCapacity(42);
    }

    public void constructA350(Builder builder) {
        builder.reset();
        builder.setModel("A350");
        builder.setPassengerCapacity(320);
        builder.setCrewCapacity(40);
    }

    public void constructAntonov_AN2(Builder builder) {
        builder.reset();
        builder.setModel("Antonov AN2");
        builder.setPassengerCapacity(15);
        builder.setCrewCapacity(3);
    }

    public void constructEmbraer_190(Builder builder) {
        builder.reset();
        builder.setModel("Embraer 190");
        builder.setPassengerCapacity(25);
        builder.setCrewCapacity(5);
    }
}
