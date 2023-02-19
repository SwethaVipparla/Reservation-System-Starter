package flight.reservation.payment;

import java.util.HashMap;
import java.util.Map;

public class Paypal implements PaymentStrategy{
    public static final Map<String, String> DATA_BASE = new HashMap<>();

    public Paypal(String email, String password) throws IllegalArgumentException{
        if (email == null || password == null) {
            throw new IllegalArgumentException("Email or password cannot be null.");
        }
        if(DATA_BASE.containsKey(email)) {
            throw new IllegalArgumentException("Email already exists.");
        } 
        else {
            DATA_BASE.put(email, password);
        }
    }

    public boolean pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
        return true;
    }
}
