package flight.reservation.plane;

import flight.reservation.plane.models.A350;
import flight.reservation.plane.models.Antonov_AN2;
import flight.reservation.plane.models.Embraer_190;
import flight.reservation.plane.models.A380;
import flight.reservation.plane.interfaces.PassengerPlane;

public class PassengerPlaneFactory {

    public static PassengerPlane createPassengerPlane(String model) {
        switch (model) {
            case "A380":
                return new A380();
            case "A350":
                return new A350();
            case "Embraer 190":
                return new Embraer_190();
            case "Antonov AN2":
                return new Antonov_AN2();
            default:
                throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }
}
