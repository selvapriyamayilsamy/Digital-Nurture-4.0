package factories;

import documents.Document;
import documents.TextDocument;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
