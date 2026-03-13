package encapsulation1;

public class Person {
    // TODO: Make 'name' and 'age' private
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // TODO: Complete the setName method
    public void setName(String name) {
        this.name = name;
    }

    // TODO: Complete the setAge method
    public void setAge(int age) {
        this.age = age;
    }

    // TODO: Complete the getName method
    public String getName() {
        return name;
    }

    // TODO: Complete the getAge method
    public int getAge() {
        return age;
    }
}