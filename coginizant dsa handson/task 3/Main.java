public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(101, "Selva", 2500.0),
                new Order(102, "Abi", 999.99),
                new Order(103, "Ram", 5600.5),
                new Order(104, "Ravi", 3200.0),
                new Order(105, "Aish", 1200.0)
        };

        System.out.println("🔹 Original Orders:");
        printOrders(orders);

        // Bubble Sort
        SortService.bubbleSort(orders);
        System.out.println("\n🔸 Orders Sorted by Bubble Sort (High to Low):");
        printOrders(orders);

        // Re-initialize for fresh data
        orders = new Order[]{
                new Order(101, "Selva", 2500.0),
                new Order(102, "Abi", 999.99),
                new Order(103, "Ram", 5600.5),
                new Order(104, "Ravi", 3200.0),
                new Order(105, "Aish", 1200.0)
        };

        // Quick Sort
        SortService.quickSort(orders, 0, orders.length - 1);
        System.out.println("\n🔸 Orders Sorted by Quick Sort (High to Low):");
        printOrders(orders);
    }

    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
