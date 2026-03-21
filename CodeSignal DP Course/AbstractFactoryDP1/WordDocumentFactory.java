package AbstractFactoryDP1;

public class WordDocumentFactory implements DocumentAbstractFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}
