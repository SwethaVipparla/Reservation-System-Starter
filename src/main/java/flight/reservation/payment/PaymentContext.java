package flight.reservation.payment;

import flight.reservation.order.Order;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment(Order order) throws Exception{
        if (order.isClosed()) {
            return true;
        }

        boolean isPaid = false;
        try {
            // validate payment information
            isPaid = paymentStrategy.pay(order.getPrice());
            order.setClosed();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

        return isPaid;
    }
}

