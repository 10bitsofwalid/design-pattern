package polymorphism2;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the CurrencyConverter class
        CurrencyConverter converter = new CurrencyConverter();
        
        // TODO: Call the convert method with amount 100 and print the result 
        // Should Output: 84.0
        System.out.println(""+converter.convert(100));

        // TODO: Call the overloaded convert method with amount 100 and rate 1.39 and print the result
        // Should Output: 139.0
        System.out.println(""+converter.convert(100, 1.39));
    }
}