package polymorphism5;

// TODO: Define the Animal class with a method makeSound for compile-time polymorphism
// - Include an overloaded makeSound method that accepts a String parameter

public class Animal{
    public void makeSound(){
        System.out.println("Makes sound: ");
    }
    
    public void makeSound(String sound){
        System.out.println(sound);
    }
}
