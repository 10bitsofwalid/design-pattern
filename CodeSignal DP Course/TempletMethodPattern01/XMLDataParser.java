package TempletMethodPattern01;

public class XMLDataParser extends DataParserTemplate {
    @Override
    public void readData() {
        System.out.println("Reading data from XML file.");
    }

    @Override
    public void processData() {
        System.out.println("Processing XML data.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to XML file.");
    }
}
