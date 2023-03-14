package OOP_HW3;

import java.util.ArrayList;

public abstract class Polygon extends Figure {

    protected ArrayList<Double> sides = new ArrayList<>();

    protected Polygon(Double... sides) {
        for (double side : sides) {
            if (side <= 0) {
                System.out.println("A rectangle with the specified sides does not exist.");
            }
        }
    }

    public Double perimeter() {
        Double sum = 0.0;
        for (Double side : this.sides) {
            sum += side;
        }
        return sum;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", sides: " + sides +
                ", perimeter: " + this.perimeter();
    }
}
