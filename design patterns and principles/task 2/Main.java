import documents.Document;
import factories.*;

public class Main {
    public static void main(String[] args) {
        // Word
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        System.out.println("-----------------------------");

        // PDF
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        System.out.println("-----------------------------");

        // Excel
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();

        System.out.println("-----------------------------");

        // Text
        DocumentFactory textFactory = new TextDocumentFactory();
        Document textDoc = textFactory.createDocument();
        textDoc.open();

        System.out.println("-----------------------------");

    }
}
