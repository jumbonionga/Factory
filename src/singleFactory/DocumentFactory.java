package singleFactory;

public class DocumentFactory {
    public IDocument createDocument(String type) {
        if(type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PDFDocument();
        }
        throw new IllegalArgumentException("Unknown document type");
    }
}
