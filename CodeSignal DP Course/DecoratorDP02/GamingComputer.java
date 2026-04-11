package DecoratorDP02;

public class GamingComputer extends ComputerDecorator{
    public GamingComputer(Computer computer){
        super(computer);
    }

    public String assemble(){
        return super.assemble() + " + gaming features";
    }
}
