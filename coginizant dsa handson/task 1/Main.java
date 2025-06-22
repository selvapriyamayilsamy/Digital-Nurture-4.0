public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product(101, "Laptop", 5, 75000));
        manager.addProduct(new Product(102, "Mouse", 20, 1500));

        // Update a product
        manager.updateProduct(101, 7, 74000);

        // Delete a product
        manager.deleteProduct(102);

        // Display inventory
        manager.displayInventory();
    }
}
