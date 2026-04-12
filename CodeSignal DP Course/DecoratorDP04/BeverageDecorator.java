package DecoratorDP04;

// TODO: Implement the Beverage interface in BeverageDecorator class
// TODO: Add a private Beverage variable named decoratedBeverage
// TODO: Create a constructor that takes a Beverage object and assigns it to decoratedBeverage
// TODO: Implement the getDescription method that returns decoratedBeverage.getDescription()

public class BeverageDecorator implements Beverage{
    private Beverage decoratedBeverage;
    
    public BeverageDecorator(Beverage beverage){
        this.decoratedBeverage = beverage;
    }
    
    public String getDescription(){
        return decoratedBeverage.getDescription();
    }
    
    
}
