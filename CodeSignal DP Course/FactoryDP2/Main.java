package FactoryDP2;

public class Main {
    public static void main(String[] args) {
        // Create a Word document using the factory method
        Document wordDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.WORD);
        wordDoc.open(); // Outputs: Successfully opened Word Document.

        // Create an Excel document using the factory method
        Document excelDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.EXCEL);
        excelDoc.open(); // Outputs: Successfully opened Excel Document.

        // TODO: Use the factory method to create and open a PDF document
        
        Document pdfDocument = DocumentFactory.getDocument(DocumentFactory.DocumentType.PDF);
        pdfDocument.open();
    }
}