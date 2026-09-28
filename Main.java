public class Main {
    public static void main(String[] args) {
        Square square = new Square(10.0, "red");
        square.printInfo();
        Circle circle = new Circle(10.0, "blue");
        circle.printInfo();
        Cylinder cylinder = new Cylinder(2.0, 10.0, "green");
        cylinder.printInfo();

        System.out.println("\n=== Polymorphism Demonstration (Shape Array) ===");
        Shape[] shapes = {
                new Shape("yellow"),
                square,
                circle,
                cylinder
        };

        for (Shape s : shapes) {
            s.printInfo();
        }
    }
}
