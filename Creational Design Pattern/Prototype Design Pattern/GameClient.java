public class GameClient {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(100, 75, 55, "Sword");

        warrior.display();

        Warrior warriorClone = warrior.clone();
        warriorClone.setWeapon("axe");
        warriorClone.display();
    }
}
