package TempletMethodPattern01;

public class Main {
    public static void main(String[] args) {
        DataParserTemplate csvParser = new CSVDataParser();
        csvParser.parseDataAndGenerateOutput();

        DataParserTemplate xmlParser = new XMLDataParser();
        xmlParser.parseDataAndGenerateOutput();
    }
}
