package flight.reservation.plane;

public class HelicopterFactory {
    public static Helicopter getHelicopter(String model) {
        if(model==null) {
            return null;
        }
        else if(model.equalsIgnoreCase("H1")) {
            return new H1();
        } 
        else if(model.equalsIgnoreCase("H2")) {
            return new H2();
        }
        else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }
}