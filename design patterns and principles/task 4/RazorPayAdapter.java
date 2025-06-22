public class RazorPayAdapter implements PaymentProcessor {
    private RazorPayGateway razorPay;

    public RazorPayAdapter(RazorPayGateway razorPay) {
        this.razorPay = razorPay;
    }

    @Override
    public void processPayment(double amount) {
        razorPay.doTransaction(amount);
    }
}