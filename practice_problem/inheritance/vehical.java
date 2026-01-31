package inheritance;

public class vehical {
    String brandname;
    int year;

    public vehical(String brandname, int year) {
        this.brandname = brandname;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Name: " + brandname);
        System.out.println("Manufactrue year: " + year);
    }
}
