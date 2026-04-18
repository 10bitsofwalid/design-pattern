package IntegratingStructuralPatternsinWebApplication02;

public class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    // TODO: Implement the showDetails method to print "File: " followed by the file name
    
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
