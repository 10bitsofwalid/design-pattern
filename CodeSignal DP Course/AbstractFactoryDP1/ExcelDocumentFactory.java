package AbstractFactoryDP1;

public class ExcelDocumentFactory implements DocumentAbstractFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
}
