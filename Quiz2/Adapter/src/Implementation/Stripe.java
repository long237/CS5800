package Implementation;

import Contracts.PaymentProcessor;

public class Stripe implements PaymentProcessor
{
    private String cardHolderName;
    private String cardNumber;
    private String expDate;

    public Stripe(String cardHolderName, String cardNumber, String expDate) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }

    public String PayUsingStripe() {
        String result = "Paying with Stripe and cardHolderName: "
                + this.cardHolderName +
                " cardNumber: " + this.cardNumber +
                " expDate: " + this.expDate;
        return result;
    }
    @Override
    public void pay(double paymentAmount) {
        System.out.println(PayUsingStripe() + "\n" + "Amount: " + paymentAmount);
    }
}
