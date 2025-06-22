public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("TCS", 3200.00);

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Simulate stock price updates
        stockMarket.setPrice(3215.75);
        stockMarket.setPrice(3250.40);

        // Remove WebApp and update again
        stockMarket.removeObserver(webApp);
        stockMarket.setPrice(3300.00);
    }
}