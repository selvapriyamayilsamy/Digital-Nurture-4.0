package documents;

public class SpreadsheetDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Spreadsheet Document.");
    }
}
