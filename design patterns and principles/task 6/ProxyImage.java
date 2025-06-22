public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("📁 Image not loaded yet. Loading...");
            realImage = new RealImage(filename); // Lazy initialization
        } else {
            System.out.println("✅ Image loaded from cache.");
        }
        realImage.display();
    }
}