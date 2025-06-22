package documents;

public class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Text Document.");
    }
}
