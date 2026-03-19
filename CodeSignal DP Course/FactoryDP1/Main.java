package FactoryDP1;

public class Main {
    public static void main(String[] args) {
        // Create a Word document using the factory method
        Document wordDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.WORD);
        wordDoc.open(); // Outputs: Opening Word Document.

        // Create an Excel document using the factory method
        Document excelDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.EXCEL);
        excelDoc.open(); // Outputs: Opening Excel Document.
    }
}