package TempletMethodPattern01;

public abstract class DataParserTemplate {
    // Template method defining the steps of the algorithm
    public final void parseDataAndGenerateOutput() {
        openFile();
        readData();
        processData();
        writeData();
    }

    // Default implementation for opening a file (common to all subclasses)
    private void openFile() {
        System.out.println("Opening file for data parsing.");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void readData();
    public abstract void processData();
    public abstract void writeData();
}
