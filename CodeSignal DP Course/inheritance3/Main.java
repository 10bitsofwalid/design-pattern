package inheritance3;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Person object with the name "Alice" and age 30
        Person person = new Person("Alice", 30);
        // TODO: Create an Employee object with the name "Bob", age 40, employeeId "E123", and department "Engineering"
        Employee employee = new Employee("Bob", 40, "E123", "Engineering");
        // TODO: Create a Manager object with the name "Charlie", age 50, employeeId "M456", department "HR", and teamSize 10
        Manager manager = new Manager("Charlie", 50, "M456", "HR", 10);

        // TODO: Display the details of the Manager object
        person.display();
        employee.displayEmployeeDetails();
        manager.displayManagerDetails();
    }
}
