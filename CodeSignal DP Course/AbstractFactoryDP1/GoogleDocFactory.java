package AbstractFactoryDP1;

public class GoogleDocFactory implements DocumentAbstractFactory {
    public Document createDocument(){
        return new GoogleDoc();
    }
}
