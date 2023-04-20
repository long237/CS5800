import Contracts.PaymentProcessor;
import Implementation.PayPal;
import Implementation.PaymentAdapter;
import Implementation.Square;
import Implementation.Stripe;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal("Jane Doe");
        PaymentProcessor stripe = new Stripe("Barry Allen", "1234 5678", "03/24");

        // Create an adapter
        Square square = new Square(22);
        PaymentAdapter paymentAdapter = new PaymentAdapter(square);

        paypal.pay(15);
        System.out.println("");
        stripe.pay(20);
        System.out.println("");
        paymentAdapter.pay(100);

    }
}