package encapsulation4;

public class Superhero {
    private String alias;
    private int strength;

    // Constructor
    public Superhero(String alias, int strength) {
        this.alias = alias;
        this.strength = strength;
    }

    // TODO: Define the setAlias method
    public void setAlias(String alias){
        this.alias = alias;
    }
    
    public void setStrength(int strength){
        this.strength = strength;
    }
    
    public String getALias(){
        return alias;
    }
    
    public int getStrength(){
        return strength;
    }

    // TODO: Define the setStrength method

    // TODO: Define the getAlias method

    // TODO: Define the getStrength method
}