package DecoratorDP04;

// TODO: Extend the BeverageDecorator class in SugarDecorator
// TODO: Create a constructor that takes a Beverage object and passes it to the BeverageDecorator constructor
// TODO: Override the getDescription method to add " + Sugar" to the base description.


public class SugarDecorator extends BeverageDecorator{
    public SugarDecorator(Beverage beverage){
        super(beverage);
    }
    
    public String getDescription(){
        return super.getDescription() + " + Sugar";
    }
}