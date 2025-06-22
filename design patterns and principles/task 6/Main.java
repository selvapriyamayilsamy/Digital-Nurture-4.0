public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("product1.jpg");

        // First time - loads from server
        image1.display();
        System.out.println("--------");

        // Second time - loads from cache
        image1.display();
    }
}