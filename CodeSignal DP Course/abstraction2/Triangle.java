package abstraction2;

// TODO: Define a public class named Triangle that extends the Shape class
// TODO: Declare a private double variable 'side'
// TODO: Create a constructor that accepts a double parameter 'side' and initializes the corresponding class variable
// TODO: Override the area() method to calculate and return the area of an equilateral triangle
// TODO: Override the perimeter() method to calculate and return the perimeter of the triangle

public class Triangle extends Shape{
    private double side;
    
    Triangle(double side){
        this.side = side;
    }
    
    public double area(){
        return (Math.sqrt(3)/4)*side*side;
    }
    
    public double perimeter(){
        return 3*side;
    }
}
