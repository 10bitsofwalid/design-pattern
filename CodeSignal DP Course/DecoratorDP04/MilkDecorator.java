package DecoratorDP04;

// TODO: Extend the BeverageDecorator class in MilkDecorator
// TODO: Create a constructor that takes a Beverage object and passes it to the BeverageDecorator constructor
// TODO: Override the getDescription method to add " + Milk" to the base description.


public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(Beverage beverage){
        super(beverage);
    }
    
    public String getDescription(){
        return super.getDescription() + " + Milk";
    }
}
