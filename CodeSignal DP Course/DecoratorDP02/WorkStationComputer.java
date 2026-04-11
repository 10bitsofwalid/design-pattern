package DecoratorDP02;

public class WorkStationComputer extends ComputerDecorator{
    public WorkStationComputer(Computer computer){
        super(computer);
    }

    public String assemble(){
        return super.assemble() + " + workstation features";
    }
}
