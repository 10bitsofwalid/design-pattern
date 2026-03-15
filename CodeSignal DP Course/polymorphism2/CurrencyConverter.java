package polymorphism2;

public class CurrencyConverter {
    // The method should convert the amount using a default rate of 0.84
    public double convert(double amount) {
        return amount * 0.84;
    }

    // TODO: Define the overloaded convert method that takes amount and rate as parameters
    // The method should convert the amount using the given rate. (amount * rate)
    
    public double convert(double amount, double rate){
        return amount * rate;
    }
}
