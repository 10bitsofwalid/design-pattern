package AbstractFactoryDP1;

public class Main {
    public static void main(String[] args) {
        Document wordDoc = DocumentFactory.createDocument(new WordDocumentFactory());
        wordDoc.open();

        Document excelDoc = DocumentFactory.createDocument(new ExcelDocumentFactory());
        excelDoc.open();

        Document googleDoc = DocumentFactory.createDocument(new GoogleDocFactory());
        googleDoc.open();

        Document googleSheet = DocumentFactory.createDocument(new GoogleSheetFactory());
        googleSheet.open();
    }
}
