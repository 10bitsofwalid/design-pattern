package TemplateMethodPattern02;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of EasyLevel
        // TODO: Call playLevel() on the EasyLevel instance
        // TODO: Create an instance of HardLevel
        // TODO: Call playLevel() on the HardLevel instance

        System.out.println("Easy Level");
        GameLevelManager easyLevel = new EasyLevel();
        easyLevel.playLevel();

        System.out.println("Hard Level");
        GameLevelManager hardLevel = new HardLevel();
        hardLevel.playLevel();
    }
}
