package PrototypeDP2;

public class FlyingHero extends Hero {

    private String power;

    // Constructor
    public FlyingHero(String alias, String power) {
        super(alias);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    // TODO: Implement the 'cloneHero' method
    @Override
    public Hero cloneHero() {
        return new FlyingHero(getAlias(), getPower());
    }

    public void showDetails() {
         // TODO: Print hero details
        System.out.println("Hero Alias: " + getAlias() + ", Power: " + getPower());
    }
}