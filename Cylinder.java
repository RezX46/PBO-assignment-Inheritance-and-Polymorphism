public class Cylinder extends Circle {
    // Atribut private height
    private double height;

    // Constructor Cylinder
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter untuk height
    public double getHeight() {
        return height;
    }

    // Setter untuk height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method volume()
    public double volume() {
        return area() * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Cylinder " + getColor() + ", volume = " + volume());
    }
}
