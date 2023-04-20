package Implementation;

import Contracts.PaymentMethod;
import Contracts.PaymentProcessor;

public class PaymentAdapter implements PaymentProcessor {
    private Square paymentMethod;

    public PaymentAdapter(Square paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void pay(double paymentAmount) {
        System.out.println(paymentMethod.PayUsingSquare() + "\n" + "" +
                "Amount: " + paymentAmount);
    }
}
