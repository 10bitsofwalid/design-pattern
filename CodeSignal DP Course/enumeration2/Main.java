package enumeration2;

public class Main {
    public static void main(String[] args) {
        for(Planet planet : Planet.values()){
            System.out.println(planet+ "\nMass: "+planet.getMass()+", Radius: "+planet.getRadius()+ ", Surface Gravity: "+planet.surfaceGravity());
        }
    }
}
