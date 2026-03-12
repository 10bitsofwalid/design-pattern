package enumeration5;

public class Main {
    public static void main(String[] args) {
        for (SuperHero hero : SuperHero.values()) {
            System.out.println(hero + ": strength = " + hero.getStrength() + ", speed = " + hero.getSpeed()
                + ", power level = " + hero.powerLevel());
        }
    }
}
