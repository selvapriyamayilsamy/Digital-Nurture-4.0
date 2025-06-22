public class Main {
    public static void main(String[] args) {
        // Step 1: Create Model
        Student student = new Student("Priya", "S101", "A");

        // Step 2: Create View
        StudentView view = new StudentView();

        // Step 3: Create Controller
        StudentController controller = new StudentController(student, view);

        // Step 4: Initial Display
        controller.updateView();

        // Step 5: Modify data via controller
        controller.setStudentName("Selva Priya");
        controller.setStudentGrade("A+");

        // Step 6: Display Updated Data
        controller.updateView();
    }
}