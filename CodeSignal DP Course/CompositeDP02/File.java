package CompositeDP02;

// TODO: Complete the File class that provides a base implementation of the FileSystemComponent interface.
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        // Print the name of the file 
        System.out.println(name);

    }
}