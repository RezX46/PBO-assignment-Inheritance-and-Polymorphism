public class Shape {
    // Atribut protected color
    protected String color;

    // Constructor Shape
    public Shape(String color) {
        this.color = color;
    }

    // Getter untuk color
    public String getColor() {
        return color;
    }

    // Setter untuk color
    public void setColor(String color) {
        this.color = color;
    }

    // Method printInfo()
    public void printInfo() {
        System.out.println("Shape colored " + color);
    }
}
