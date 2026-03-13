package encapsulation4;

public class Main {
    public static void main(String[] args) {
        Superhero hero = new Superhero("Iron Man", 85);

        // TODO: Use setAlias and setStrength methods to change the values to "Doctor Strange" and 95
        hero.setAlias("Doctor Strange");
        hero.setStrength(95);

        // TODO: Print the alias and strength using getAlias and getStrength methods
        System.out.println("Name: "+hero.getALias()+ ", Power: "+hero.getStrength());
    }
}