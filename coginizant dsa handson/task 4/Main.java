public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Add Employees
        manager.addEmployee(new Employee(101, "Selva", "Developer", 75000));
        manager.addEmployee(new Employee(102, "Abi", "Designer", 68000));
        manager.addEmployee(new Employee(103, "Ram", "Manager", 90000));

        // Display
        manager.displayEmployees();

        // Search
        System.out.println("\n🔍 Searching for Employee ID 102...");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? "✅ Found: " + found : "❌ Not Found");

        // Delete
        System.out.println("\n🗑 Deleting Employee ID 101...");
        boolean deleted = manager.deleteEmployee(101);
        System.out.println(deleted ? "✅ Deleted" : "❌ Not Found");

        // Display Again
        System.out.println("\n📋 Updated Employee List:");
        manager.displayEmployees();
    }
}