package inheritance2;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void showSpecies() {
        System.out.println("Species: " + species);
    }
}
