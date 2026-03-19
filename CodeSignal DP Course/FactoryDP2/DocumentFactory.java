package FactoryDP2;

public class DocumentFactory {
    // Enum to define supported document types
    // TODO: Add a new PDF type to the enum
    public enum DocumentType {
        WORD, EXCEL, PDF
    }

    // Factory method to create documents based on the type
    // TODO: Update the switch statement to handle the new PDF type
    public static Document getDocument(DocumentType type) {
        switch (type) {
            case WORD:
                return new WordDocument();
            case EXCEL:
                return new ExcelDocument();
            // TODO: Handle the PDF case and return a new PDFDocument
            case PDF:
            return new PDFDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
