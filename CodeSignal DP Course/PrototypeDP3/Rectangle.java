package PrototypeDP3;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Shape cloneShape() {
        return new Rectangle(getColor(), width, height);
    }

    public void showDetails() {
        System.out.println("Rectangle — Color: " + getColor() + ", Width: " + width + ", Height: " + height);
    }
}
