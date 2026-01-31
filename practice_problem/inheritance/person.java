package inheritance;

public class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
