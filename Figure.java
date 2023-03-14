package OOP_HW3;

public abstract class Figure implements Comparable<Figure> {

    public abstract Double area();

    @Override
    public String toString() {
        return this.getClass().getSimpleName().toUpperCase() + ", area: " + this.area();
    }

    @Override
    public int compareTo(Figure o) {
        if (this.area() > o.area()) {
            return 1;
        } else if (this.area() < o.area()) {
            return -1;
        } else
            return 0;
    }
}
