package BankingSystemCP05;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an original CustomerProfile object

        // TODO: Clone the original CustomerProfile object

        // TODO: Print both the original and cloned profiles to observe they are separate instances
        
        CustomerProfile original = new CustomerProfile(
                "John Doe",
                "123 Main St, New York",
                "ACC-98765"
        );

        CustomerProfile cloned = (CustomerProfile) original.clonePrototype();

        cloned.setCustomerName("Jane Doe");
        cloned.setAddress("456 Elm St, Boston");
        cloned.setAccountNumber("ACC-11111");

        System.out.println("Original Profile: " + original);
        System.out.println("Cloned Profile:   " + cloned);

        System.out.println("Same instance? " + (original == cloned));

    }
}