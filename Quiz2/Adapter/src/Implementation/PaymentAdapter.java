package Implementation;

import Contracts.PaymentProcessor;

public class PaymentAdapter implements PaymentProcessor {
    Square paymentMethod;

    public PaymentAdapter(Square paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void pay(double paymentAmount) {
        System.out.println(paymentMethod.PayUsingSquare() + "\n" + "" +
                "Amount: " + paymentAmount);
    }
}
