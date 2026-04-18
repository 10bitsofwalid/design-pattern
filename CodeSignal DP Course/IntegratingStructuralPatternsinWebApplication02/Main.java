package IntegratingStructuralPatternsinWebApplication02;

public class Main {
    public static void main(String[] args) {
        // TODO: Create instances of File with names "File1.txt" and "File2.txt"
        // TODO: Create instances of Directory
        // TODO: Add files to the first directory
        // TODO: Add the first directory to the second directory
        // TODO: Display details of the first directory (expect to see details of both files)
        // TODO: Display details of the second directory (expect to see details of the first directory and its contents)
        
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Directory dir1 = new Directory("Dir1");
        Directory dir2 = new Directory("Dir2");

        dir1.add(file1);
        dir1.add(file2);

        dir2.add(dir1);

        System.out.println("Dir1 Details");
        dir1.showDetails();

        System.out.println("Dir2 Details");
        dir2.showDetails();
    }
}