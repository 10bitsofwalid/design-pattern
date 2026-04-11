package DecoratorDP02;

public abstract class ComputerDecorator implements Computer {
    protected Computer decoratedComputer;

    public ComputerDecorator(Computer computer){
        this.decoratedComputer = computer;
    }

    public String assemble(){
        return decoratedComputer.assemble();
    }
}
