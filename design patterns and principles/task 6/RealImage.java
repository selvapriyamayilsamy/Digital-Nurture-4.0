public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromServer();  // simulate heavy loading
    }

    private void loadFromServer() {
        System.out.println("⏳ Loading image from server: " + filename);
        try {
            Thread.sleep(2000); // Simulate network delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("🖼️ Displaying image: " + filename);
    }
}