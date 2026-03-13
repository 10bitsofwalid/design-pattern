package encapsulation2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        if(age<0){
            this.age = 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO: Update the setAge method to reject negative values
    public void setAge(int age) {
        this.age = age;
        if(age<0){
            this.age = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
