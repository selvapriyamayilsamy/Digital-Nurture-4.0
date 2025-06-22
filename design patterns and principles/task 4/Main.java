public class Main {
    public static void main(String[] args) {
        // Using PayPal
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(500.00);

        // Using Stripe
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(750.50);

        // Using RazorPay
        PaymentProcessor razorProcessor = new RazorPayAdapter(new RazorPayGateway());
        razorProcessor.processPayment(1200.00);
    }
}