package flight.reservation.plane;

import flight.reservation.plane.interfaces.Helicopter;
import flight.reservation.plane.models.H1;
import flight.reservation.plane.models.H2;

public class HelicopterFactory {
    public static Helicopter getHelicopter(String model) {
        if (model == null) {
            return null;
        } else if (model.equalsIgnoreCase("H1")) {
            return new H1();
        } else if (model.equalsIgnoreCase("H2")) {
            return new H2();
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }
}