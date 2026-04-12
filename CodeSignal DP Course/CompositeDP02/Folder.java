package CompositeDP02;

import java.util.ArrayList;
import java.util.List;

// TODO: Complete the Folder class that can contain multiple FileSystemComponent objects.
public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    // TODO: Complete the addComponent method to add a component to the folder
    public void addComponent(FileSystemComponent component) {
        // Add the component to the components list
        components.add(component);

    }

    // TODO: Complete the removeComponent method to remove a component from the folder
    public void removeComponent(FileSystemComponent component) {
        // Remove the component from the components list
        components.remove(component);

    }

    // TODO: Complete the showDetails() method to show the details of the folder
    @Override
    public void showDetails() {
        // Print the name of the folder
        // Iterate over the components and call showDetails() on each
        
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }

    }
}
