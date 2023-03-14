package OOP_HW3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection f = new Collection();
        ArrayList<Figure> figures = f.getFigures();

        figures.add(new Rectangle(34, 3));
        figures.add(new Triangle(5, 7, 7));
        figures.add(new Square(12));
        figures.add(new Circle(9));

        Menu menu = new Menu();
        menu.setAction(figures);

    }
}
