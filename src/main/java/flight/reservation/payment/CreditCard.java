package flight.reservation.payment;

import java.util.Date;

public class CreditCard implements PaymentStrategy {
    private double amount;
    private String number;
    private Date date;
    private String cvv;
    private boolean valid;

    public CreditCard(String number, Date date, String cvv) {
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.setValid();
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid() {
        // Dummy validation
        this.valid = number.length() > 0 && date.getTime() > System.currentTimeMillis() && !cvv.equals("000");
    }

    public boolean pay(double amount) throws IllegalStateException {
        // validate payment information
        if (!cardIsPresentAndValid(this)) {
            throw new IllegalStateException("Payment information is not set or not valid.");
        }

        System.out.println("Paying " + amount + " using Credit Card.");
        double remainingAmount = getAmount() - amount;
        if (remainingAmount < 0) {
            System.out.printf("Card limit reached - Balance: %f%n", remainingAmount);
            throw new IllegalStateException("Card limit reached");
        }
        setAmount(remainingAmount);
        return true;
    }

    private boolean cardIsPresentAndValid(CreditCard card) {
        return card != null && card.isValid();
    }
}