public class Circle extends Shape {
    public static final double PI = Math.PI;
    // Atribut protected radius
    protected double radius;

    // Constructor Circle
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method area()
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Circle " + getColor() + ", area = " + area());
    }
}
