package enumeration6;

// TODO: Iterate over all values of the Superhero enum and print out the power level and year introduced for each superhero
public class Main {
    public static void main(String[] args) {
        // TODO: Implement the loop to iterate and print details of superheroes here 
        for(Superhero supeher : Superhero.values()){
            System.out.println(supeher+": Power: "+supeher.getPowerLevel()+", Year: "+supeher.getYear());
        }
    }
}