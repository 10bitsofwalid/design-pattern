package DecoratorDP04;

public class Main {
    public static void main(String[] args) {
        // TODO: Create instances of BasicCoffee and wrap them using MilkDecorator and SugarDecorator.
        // Print the final descriptions.
        
        Beverage milkBeverage = new MilkDecorator(new BasicCoffee());
        System.out.println(milkBeverage.getDescription());
        
        Beverage sugBeverage = new SugarDecorator(new BasicCoffee());
        System.out.println(sugBeverage.getDescription());
        

    }
}