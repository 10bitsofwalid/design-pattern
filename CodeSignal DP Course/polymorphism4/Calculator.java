package polymorphism4;

// TODO: Define the Calculator class
// - Include a calculate method that adds two integers
// - Include an overloaded calculate method that calculates the power of a number

public class Calculator {
    // TODO: Define the calculate methods
    public int calculate(int num1, int num2){
        return num1+num2;
    }
    
    public double calculate(double num3, double num4){
        return Math.pow(num3, num4);
    }
}