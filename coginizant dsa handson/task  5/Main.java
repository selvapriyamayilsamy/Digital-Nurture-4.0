public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add Tasks
        manager.addTask(1, "Design Homepage", "Pending");
        manager.addTask(2, "Build Backend", "In Progress");
        manager.addTask(3, "Write Tests", "Pending");

        // Display Tasks
        manager.displayTasks();

        // Search for a Task
        System.out.println("\n🔍 Searching Task ID 2...");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? "✅ Found: " + found : "❌ Not Found");

        // Delete a Task
        System.out.println("\n🗑 Deleting Task ID 1...");
        boolean deleted = manager.deleteTask(1);
        System.out.println(deleted ? "✅ Deleted" : "❌ Not Found");

        // Display Again
        System.out.println("\n📋 Updated Task List:");
        manager.displayTasks();
    }
}