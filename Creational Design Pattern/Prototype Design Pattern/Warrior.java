public class Warrior implements GameCharacter {
    private int health;
    private int attackpower;
    private int defense;
    private String weapon;

    public Warrior(int health, int attackpower, int defense, String weapon) {
        this.health = health;
        this.attackpower = attackpower;
        this.defense = defense;
        this.weapon = weapon;
    }

    public Warrior clone() {
        return new Warrior(health, attackpower, defense, weapon);
    }

    public void display() {
        System.out.println("Warrior: \n Health: " + health + "\n Attack Power: " + attackpower + "\n Defense: "
                + defense + "\n Weapon: " + weapon);
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
