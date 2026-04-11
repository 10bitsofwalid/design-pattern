package FactoryDesignPattern;

public class Paypal implements Payment {
    public void pay(int amount) {
        System.out.println("Payed through Paypal");
    }
}
