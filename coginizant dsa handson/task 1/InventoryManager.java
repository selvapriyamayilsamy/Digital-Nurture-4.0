import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("✅ Product added: " + product);
    }

    // Update product quantity and price
    public void updateProduct(int productId, int newQuantity, double newPrice) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("🔄 Product updated: " + product);
        } else {
            System.out.println("❌ Product not found.");
        }
    }

    // Delete product
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("🗑️ Product deleted.");
        } else {
            System.out.println("❌ Product not found.");
        }
    }

    // Display all products
    public void displayInventory() {
        System.out.println("\n📦 Current Inventory:");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
