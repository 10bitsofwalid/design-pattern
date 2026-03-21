package AbstractFactoryDP1;

public class DocumentFactory {
    public static Document createDocument(DocumentAbstractFactory factory){
        return factory.createDocument();
    }
}
