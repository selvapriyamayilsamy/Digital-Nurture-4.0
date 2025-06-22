public class TaskManager {
    private Task head;

    // Add Task at end
    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("✅ Added: " + newTask);
    }

    // Search Task by ID
    public Task searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) return current;
            current = current.next;
        }
        return null;
    }

    // Traverse all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("📭 No tasks to show.");
            return;
        }
        System.out.println("📋 Task List:");
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Delete task by ID
    public boolean deleteTask(int id) {
        if (head == null) return false;

        if (head.taskId == id) {
            head = head.next;
            return true;
        }

        Task current = head;
        while (current.next != null) {
            if (current.next.taskId == id) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }
}