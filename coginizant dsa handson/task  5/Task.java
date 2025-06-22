public class Task {
    int taskId;
    String taskName;
    String status;
    Task next;  // reference to next node

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Task #" + taskId + " | " + taskName + " | Status: " + status;
    }
}