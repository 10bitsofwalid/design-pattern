package CompositeDP02;

public class Main {
    public static void main(String[] args) {
        // TODO: Create two File instances
        // TODO: Create a Folder instance "MyFolder" and add the above files to it
        // TODO: Show details of the folder and its contents
        
        File file1 = new File("Document.txt");
        File file2 = new File("Photo.png");

        Folder folder = new Folder("MyFolder");
        folder.addComponent(file1);
        folder.addComponent(file2);

        folder.showDetails();

        File file3 = new File("Spreadsheet.xlsx");
        Folder subFolder = new Folder("SubFolder");
        subFolder.addComponent(file3);
        folder.addComponent(subFolder);
        folder.showDetails();
    }
}
