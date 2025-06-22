public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("📲 Mobile App: " + stockName + " is now ₹" + stockPrice);
    }
}