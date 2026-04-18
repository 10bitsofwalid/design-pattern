package IntegratingStructuralPatternsinWebApplication02;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> contents = new ArrayList<>();

    // TODO: Implement the add method to add a FileSystem object (File or Directory) to the contents list
    
    // TODO: Implement the remove method to remove a FileSystem object from the contents list
    
    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        contents.add(fileSystem);
    }
    public void remove(FileSystem fileSystem) {
        contents.remove(fileSystem);
    }

    public void showDetails() {
        // TODO: Implement this method to iterate through the contents list and call showDetails on each FileSystem object
        
        System.out.println("Directory: " + name);
        for (FileSystem item : contents) {
            item.showDetails();
        }
    }
}
