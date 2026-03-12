package enumeration6;

// TODO: Define the Superhero enum
// TODO: Define the constants SUPERMAN, BATMAN, WONDER_WOMAN, and SPIDERMAN with their respective power levels and year introduced
// TODO: Create private final int fields for power level and year introduced
// TODO: Implement a constructor that accepts power level and year introduced as parameters and initializes the corresponding fields
// TODO: Write accessor methods getPowerLevel() and getYearIntroduced() returning int values

public enum Superhero {
    // TODO: Implement the enum constants and methods
    SUPERMAN(90, 1956),
    BATMAN(93, 1956),
    WONDER_WOMAN(78, 1960),
    SPIDERMAN(80, 1965);
    
    
    private final int powerLevel;
    private final int year;
    
    Superhero(int powerLevel, int year){
        this.powerLevel = powerLevel;
        this.year = year;
    }
    
    public int getPowerLevel(){
        return powerLevel;
    }
    public int getYear(){
        return year;
    }
}