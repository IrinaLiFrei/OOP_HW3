package OOP_HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Collection {

    private ArrayList<Figure> figures = new ArrayList<>();

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void showFigures(ArrayList<Figure> figures) {
        for (int i = 0; i < figures.size(); i++) {
            System.out.print("\t" + (i + 1) + ". ");
            System.out.println(figures.get(i));
        }
    }

    public void addFigure(ArrayList<Figure> figures) {
        Scanner s = new Scanner(System.in);
        System.out.println("What figure do you want to add? Enter a number: " + "\n" +
                "           1. Circle" + "\n" +
                "           2. Square" + "\n" +
                "           3. Rectangle" + "\n" +
                "           4. Triangle");
        if (s.hasNextInt()) {
            Integer num = s.nextInt();
            if (num < 0 || num > 4) {
                System.out.println("Enter the number from 1 to 4.");
                addFigure(figures);
            }
            if (num == 1) {
                System.out.println("Enter the radius of the circle: ");
                Double r = s.nextDouble();
                Circle circ = new Circle(r);
                figures.add(circ);
                System.out.println("The circle has been successfully added!");

            }
            if (num == 2) {
                System.out.println("Enter the side length: ");
                Double side = s.nextDouble();
                Square square = new Square(side);
                figures.add(square);
                System.out.println("The square has been successfully added!");

            }
            if (num == 3) {
                System.out.println("Enter the side lengths: ");
                Double side1 = s.nextDouble();
                Double side2 = s.nextDouble();
                Rectangle rect = new Rectangle(side1, side2);
                figures.add(rect);
                System.out.println("The rectangle has been successfully added!");

            }
            if (num == 4) {
                System.out.println("Enter the side lengths: ");
                Double side1 = s.nextDouble();
                Double side2 = s.nextDouble();
                Double side3 = s.nextDouble();
                Triangle trian = new Triangle(side1, side2, side3);
                figures.add(trian);
                System.out.println("The triangle has been successfully added!");
            }
        }
    }

    public void removeFigure(ArrayList<Figure> figures) {
        Scanner s = new Scanner(System.in);
        System.out.println("What figure do you want to remove? Enter the number of a figure: ");
        showFigures(figures);
        if (s.hasNextInt()) {
            Integer num = s.nextInt();
            if (num > figures.size()) {
                System.out.println("Try again!");
                removeFigure(figures);
            } else {
                figures.remove(num - 1);
                System.out.println("The figure has been successfully removed!");
            }
        }
    }

    public void changeFigure(ArrayList<Figure> figures) {
        Scanner s = new Scanner(System.in);
        System.out.println("What figure do you want to change? Enter the number of a figure: ");
        showFigures(figures);
        if (s.hasNextInt()) {
            Integer num = s.nextInt();
            if (num <= figures.size()) {
                Scanner scan = new Scanner(System.in).useLocale(Locale.US);
                if (figures.get(num - 1) instanceof Circle) {
                    System.out.println("Enter the radius of the circle: ");
                    Double r = scan.nextDouble();
                    Circle circ = new Circle(r);
                    figures.set(num - 1, circ);
                    System.out.println("The parameters of the circle have been successfully changed!");
                } else if (figures.get(num - 1) instanceof Square) {
                    System.out.println("Enter new side length: ");
                    Double side = scan.nextDouble();
                    Square square = new Square(side);
                    figures.set(num - 1, square);
                    System.out.println("The parameters of the square have been successfully changed!");
                } else if (figures.get(num - 1) instanceof Rectangle) {
                    System.out.println("Enter new sides lengths: ");
                    Double side1 = scan.nextDouble();
                    Double side2 = scan.nextDouble();
                    Rectangle rect = new Rectangle(side1, side2);
                    figures.set(num - 1, rect);
                    System.out.println("The parameters of the rectangle have been successfully changed!");
                } else if (figures.get(num - 1) instanceof Triangle) {
                    System.out.println("Enter new sides lengths: ");
                    Double side1 = scan.nextDouble();
                    Double side2 = scan.nextDouble();
                    Double side3 = scan.nextDouble();
                    Triangle trian = new Triangle(side1, side2, side3);
                    figures.set(num - 1, trian);
                    System.out.println("The parameters of the triangle have been successfully changed!");
                }

            }
        } else {
            System.out.println("Try again!");
            changeFigure(figures);
        }
    }

    public void sortByArea(ArrayList<Figure> figures) {
        Collections.sort(figures);
        System.out.println("Figures have been successfully sorted by their area!");
    }
}
