package AbstractFactoryDP1;


public class GoogleSheetFactory implements DocumentAbstractFactory{
    public Document createDocument(){
        return new GoogleSheet();
    }
}
