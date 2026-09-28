public class Square extends Shape {
    // Atribut private side
    private double side;

    // Constructor Square
    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    // Getter untuk side
    public double getSide() {
        return side;
    }

    // Setter untuk side
    public void setSide(double side) {
        this.side = side;
    }

    // Method area()
    public double area() {
        return side * side;
    }

    public void printInfo() {
        System.out.println("Square colored " + getColor() + ", area = " + area());
    }
}
