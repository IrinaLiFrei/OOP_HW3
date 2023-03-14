package OOP_HW3;

public class Rectangle extends Polygon {

    public Rectangle(double side1, double side2) {
        super(side1, side2);
        this.sides.add(side1);
        this.sides.add(side2);
        this.sides.add(side1);
        this.sides.add(side2);
    }

    @Override
    public Double area() {
        return this.sides.get(0) * this.sides.get(1);
    }
}
