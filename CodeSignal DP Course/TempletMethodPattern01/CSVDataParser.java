package TempletMethodPattern01;

public class CSVDataParser extends DataParserTemplate {
    @Override
    public void readData() {
        System.out.println("Reading data from CSV file.");
    }

    @Override
    public void processData() {
        System.out.println("Processing CSV data.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to CSV file.");
    }
}
