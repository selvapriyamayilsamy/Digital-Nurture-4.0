import models.Product;
import search.LinearSearch;
import search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "iPhone 14", "Electronics"),
                new Product(102, "MacBook Air", "Electronics"),
                new Product(103, "Nike Sneakers", "Footwear"),
                new Product(104, "Coffee Mug", "Home"),
                new Product(105, "Wrist Watch", "Accessories")
        };

        int searchId = 103;

        System.out.println("🔍 Linear Search:");
        Product foundLinear = LinearSearch.search(products, searchId);
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        System.out.println("\n🔍 Binary Search:");
        Product foundBinary = BinarySearch.search(products, searchId);
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}
