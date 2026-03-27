package PrototypeDP2;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an original FlyingHero object with alias "SkyDiver" and power "Super Flight" and a clone of it

        // TODO: Display details of the original and cloned heroes

        // Should Output: Hero Alias: SkyDiver, Power: Super Flight

        // Should Output: Hero Alias: SkyDiver, Power: Super Flight
        
        FlyingHero originalHero = new FlyingHero("SkyDiver", "Super Flight");
        
         FlyingHero clonedHero = (FlyingHero) originalHero.cloneHero();

        System.out.println("Original Hero:");
        originalHero.showDetails();

        System.out.println("Cloned Hero:");
        clonedHero.showDetails();
        
    }
}