package OOP_HW3;

public class Triangle extends Polygon {
    
    public Triangle(double side1, double side2, double side3) {
        this.sides.add(side1);
        this.sides.add(side2);
        this.sides.add(side3);

        if (!((side1 + side2) > side3 && (side2 + side3) > side1 && (side3 + side1) > side2)) {
            System.out.println("A triangle with the specified sides does not exist.");
        }
    }

    @Override
    public Double area() {
        Double halfPerim = this.perimeter() / 2;
        return Math.sqrt(halfPerim * ((halfPerim - this.sides.get(0)) * (halfPerim - this.sides.get(1))
                * (halfPerim - this.sides.get(2))));
    }

}
