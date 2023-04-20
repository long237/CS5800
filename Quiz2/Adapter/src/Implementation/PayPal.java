package Implementation;

import Contracts.PaymentProcessor;

public class PayPal implements PaymentProcessor {
    private String userName;

    public PayPal(String userName) {
        this.userName = userName;
    }

    public String PayUsingPayPal() {
        String result = "Pay using Paypal with userName: " + userName;
        return result;
    }
    @Override
    public void pay(double paymentAmount) {
        System.out.println(PayUsingPayPal() + "\n" + "Amount: " + paymentAmount);
    }
}
