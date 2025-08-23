package day_5_Assignments;

public class Rectangle {
    private double width;
    private double height;
    private static final double DEFAULT_SIZE = 1.0;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException(
                "Width must be positive. Given: " + width);
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException(
                "Height must be positive. Given: " + height);
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayDetails() {
        System.out.printf(
            "Rectangle [width=%.2f, height=%.2f, area=%.2f, perimeter=%.2f]%n",
            width, height, getArea(), getPerimeter());
    }

    public static void main(String[] args) {
        try {
            Rectangle r = new Rectangle(5.0, 3.0);

            Rectangle invalid = new Rectangle(2.0, 0.0);
            invalid.displayDetails(); 
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating rectangle: " + e.getMessage());
        }
    }
}
