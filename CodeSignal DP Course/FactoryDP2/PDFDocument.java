package FactoryDP2;

// TODO: Create PDFDocument class that extends Document and overrides the open() method
// with the message "Successfully opened PDF Document."

public class PDFDocument extends Document{
    public void open(){
        System.out.println("Successfully opened PDF Document");
    }
}