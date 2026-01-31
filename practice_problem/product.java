public class product {
    private int productid;
    private String productname;
    private double price;

    public product(int productid, String productname, double price) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
    }

    public void display() {
        System.out.println("Product ID: " + productid);
        System.out.println("Product Name: " + productname);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        product p1 = new product(101, "laptop", 70000);
        p1.display();
    }
}
