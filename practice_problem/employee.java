public class employee {

    private String name;
    private int id;
    private double salary;

    public Employee() {
        this.name = "www";
        this.id = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println(" " + name);
        System.out.println(" " + id);
        System.out.println(" " + salary);
    }

    public static void main(String[] args) {

        employee emp1 = new employee();
        employee emp2 = new employee("walid", 101, 4000.0);

        emp1.display();
        emp2.display();

    }
}
