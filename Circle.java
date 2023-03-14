package OOP_HW3;

public class Circle extends Figure {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (radius <= 0) {
            System.out.println("A circle with the specified radius does not exist");
        }
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius: " + this.radius +
                ", circumference: " + this.circumference();
    }
}
